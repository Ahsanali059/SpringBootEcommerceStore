package in.sp.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
	@RequestMapping(value="/aaa", method=RequestMethod.POST)
	public ModelAndView openHelloPage(@RequestParam("name1") String myname, @RequestParam("email1") String myemail)
	{
		ArrayList<String> al = new ArrayList<>();
		al.add(myname);
		al.add(myemail);
		
		ModelAndView mav = new ModelAndView("hello", "alObj", al);
		return mav;
	}
}