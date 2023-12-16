package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController
{
	@RequestMapping("/loginform")
	public String openLoginForm()
	{
		return "login";
	}
	
	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String login(@RequestParam("email1") String email, @RequestParam("pass1") String pass, Model model, HttpServletRequest request)
	{
		//create service and DAO layer
		
		if(email.equals("deepak@gmail.com") && pass.equals("deepak123"))
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("s_name", "Deepak Panwar");
			session.setAttribute("s_email", "deepak@gmail.com");
			session.setAttribute("s_gender", "Male");
			session.setAttribute("s_city", "Chandigarh");
			
			return "my-profile";
		}
		else if(email.equals("priya@gmail.com") && pass.equals("priya123"))
		{
			HttpSession session = request.getSession();
			
			session.setAttribute("s_name", "Priya Kumari");
			session.setAttribute("s_email", "priya@gmail.com");
			session.setAttribute("s_gender", "Female");
			session.setAttribute("s_city", "Mumbai");
			
			return "my-profile";
		}
		else
		{
			String error = "Email id and password didnt matched";
			model.addAttribute("m_error", error);
			
			return "error";
		}
	}
}
