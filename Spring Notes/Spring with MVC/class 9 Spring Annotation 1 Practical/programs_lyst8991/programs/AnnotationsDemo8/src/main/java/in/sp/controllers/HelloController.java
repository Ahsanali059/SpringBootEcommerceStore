package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.sp.beans.Student;

@Controller
public class HelloController
{
	@RequestMapping(value="/aaa", method=RequestMethod.POST)
	public ModelAndView openHelloPage(@RequestParam("name1") String myname, @RequestParam("email1") String myemail)
	{
		Student std = new Student();
		std.setName(myname);
		std.setEmail(myemail);
		
		ModelAndView mav = new ModelAndView("hello", "stdObj", std);
		return mav;
	}
}