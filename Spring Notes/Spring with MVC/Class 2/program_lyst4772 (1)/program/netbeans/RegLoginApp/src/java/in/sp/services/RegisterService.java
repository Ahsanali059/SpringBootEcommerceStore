
package in.sp.services;

import in.sp.dao.RegisterDao;

public class RegisterService
{
    public boolean insertUserDetailsService(String[] userArr)
    {
        RegisterDao regdDao = new RegisterDao();
        boolean status = regdDao.insertUserDetails(userArr);
        
        return status;
    }
}
