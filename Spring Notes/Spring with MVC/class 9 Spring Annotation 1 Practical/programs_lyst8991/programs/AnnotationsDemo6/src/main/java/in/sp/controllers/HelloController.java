package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
	@RequestMapping(value="/aaa", method=RequestMethod.POST)
	public ModelAndView openHelloPage(@RequestParam("name1") String myname)
	{
		ModelAndView mav = new ModelAndView("hello", "nameObj", myname);
		return mav;
	}
}

// String myname = (String) request.getParameter("name1"); --> @RequestParam("name1") String myname