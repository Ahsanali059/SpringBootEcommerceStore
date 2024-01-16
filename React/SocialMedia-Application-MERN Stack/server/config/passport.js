const dotenv = require('dotenv');
dotenv.config();

const User = require('../models/user.model');
const Token = require('../models/token.model');
const JwtStrategy = require('passport-jwt').Strategy;
const ExtractJwt = require('passport-jwt').ExtractJwt;
const passport = require('passport');
const opts = {};
const jwt = require('jsonwebtoken');

opts.jwtFromRequest = ExtractJwt.fromAuthHeaderAsBearerToken();
opts.secretOrKey = process.env.SECRET || 'your_default_secret_key'; // Provide a default if not found in .env

passport.use(
  new JwtStrategy(opts, async function (jwt_payload, done) {
    try {
      const user = await User.findOne({ email: jwt_payload.email });

      if (user) {
        const refreshTokenFromDB = await Token.findOne({
          user: user._id,
        });

        if (!refreshTokenFromDB) {
          return done(null, false);
        }

        try {
          const refreshPayload = jwt.verify(
            refreshTokenFromDB.refreshToken,
            process.env.REFRESH_SECRET || 'your_default_refresh_secret_key' // Provide a default if not found in .env
          );

          if (refreshPayload.email !== jwt_payload.email) {
            return done(null, false);
          }
        } catch (verifyError) {
          // Handle JWT verification error
          console.error('Error verifying refresh token:', verifyError);
          return done(verifyError, false);
        }

        const tokenExpiration = new Date(jwt_payload.exp * 1000);
        const now = new Date();
        const timeDifference = tokenExpiration.getTime() - now.getTime();

        if (timeDifference > 0 && timeDifference < 30 * 60 * 1000) {
          const payloadNew = {
            _id: user._id,
            email: user.email,
          };
          const newToken = jwt.sign(payloadNew, process.env.SECRET || 'your_default_secret_key', {
            expiresIn: '6h',
          });

          return done(null, { user, newToken });
        }

        return done(null, { user });
      } else {
        return done(null, false);
      }
    } catch (err) {
      // Handle other errors
      console.error('Error in Passport JWT strategy:', err);
      return done(err, false);
    }
  })
);

module.exports = passport;
