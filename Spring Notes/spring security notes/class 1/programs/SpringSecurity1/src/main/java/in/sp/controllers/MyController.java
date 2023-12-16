package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController
{
	@RequestMapping("/home")
	public String openHomePage()
	{
		return "home";
	}
	
	@RequestMapping("/admin")
	public String openAdminPanel()
	{
		return "admin-panel";
	}
}
