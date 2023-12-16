package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import in.sp.beans.Student;

@Controller
public class RegisterController
{
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public String register(@ModelAttribute("ma_student") Student std, Model model)
	{
		boolean status = true;	//true when data is inserted in database successfully else false
		
		if(status)
		{
			model.addAttribute("m_student", std);
			
			return "profile";
		}
		else
		{
			String myerror = "Student not registered due to some error";
			model.addAttribute("m_error", myerror);
			
			return "error";
		}
	}
}




















/*
@Controller
public class RegisterController
{
	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public String register(
								@RequestParam("name1") String myname,
								@RequestParam("email1") String myemail,
								@RequestParam("pass1") String mypass,
								@RequestParam("gender1") String mygender,
								@RequestParam("city1") String mycity,
								Model model
							)
	{
		boolean status = false;	//true when data is inserted in database successfully else false
		
		if(status)
		{
			Student std = new Student();
			std.setName(myname);
			std.setEmail(myemail);
			std.setPassword(mypass);
			std.setGender(mygender);
			std.setCity(mycity);
			
			model.addAttribute("m_student", std);
			
			return "profile";
		}
		else
		{
			String myerror = "Student not registered due to some error";
			model.addAttribute("m_error", myerror);
			
			return "error";
		}
	}
}
*/