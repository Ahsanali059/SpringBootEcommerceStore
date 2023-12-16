package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
	@RequestMapping(value="/aaa", method=RequestMethod.POST)
	public ModelAndView openHelloPage(HttpServletRequest request, HttpServletResponse response)
	{
		String myname = (String) request.getParameter("name1");
		ModelAndView mav = new ModelAndView("hello", "nameObj", myname);
		return mav;
	}
}