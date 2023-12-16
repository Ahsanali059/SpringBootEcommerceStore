package in.sp.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import in.sp.beans.Student;

@Controller
public class RegisterController 
{
	@RequestMapping("/regPage")
	public String openRegPage(Model model)
	{
		model.addAttribute("std", new Student());
		return "register";
	}
	
	@RequestMapping("/regForm")
	public String registerForm(@Valid @ModelAttribute("std") Student std, BindingResult br)
	{
		if(br.hasErrors())
		{
			return "register";
		}
		else
		{
			return "profile";
		}
	}
}
