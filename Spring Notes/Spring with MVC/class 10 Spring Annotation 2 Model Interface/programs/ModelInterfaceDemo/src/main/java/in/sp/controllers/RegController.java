package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegController
{
	@RequestMapping("/register")
	public String register(@RequestParam(name="name1") String myname, @RequestParam(name="email1") String myemail, @RequestParam(name="pass1") String mypass, Model model)
	{
		
		boolean regStatus = false;
		
		if(regStatus == true)
		{
			model.addAttribute("m_name", myname);
			model.addAttribute("m_email", myemail);
			
			return "profile";
		}
		else
		{
			String error_msg = "User not registered due to some error";
			model.addAttribute("m_error", error_msg);
			
			return "error";
		}
	}
}
