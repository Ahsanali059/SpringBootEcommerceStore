package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController 
{
	@RequestMapping("/home")
	public String openHomePage()
	{
		return "home";
	}
	
	@RequestMapping("/settings")
	public String openSettingsPage()
	{
		return "settings";
	}
	
	@RequestMapping("/myprofile")
	public String openMyProfilePage()
	{
		return "my-profile";
	}
	
	@RequestMapping("logout")
	public String logout(HttpServletRequest request)
	{
		HttpSession session = request.getSession();
		session.invalidate();
		
		return "login";
	}
}
