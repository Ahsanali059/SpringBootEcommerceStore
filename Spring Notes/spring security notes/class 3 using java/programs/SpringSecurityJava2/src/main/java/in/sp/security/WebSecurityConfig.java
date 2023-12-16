package in.sp.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@EnableWebSecurity
@ComponentScan("in.sp.controllers")
public class WebSecurityConfig extends WebSecurityConfigurerAdapter
{
	@Bean
	@Override
	protected UserDetailsService userDetailsService() 
	{
		UserDetails ud = User.withUsername("admin").password("admin123").roles("ADMIN").build();
		
		InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
		manager.createUser(ud);
		
		return manager;
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception
	{
		http
			.authorizeRequests()
			.antMatchers("/admin")
			.hasRole("ADMIN")
			.and()
			.formLogin();
	}
}
