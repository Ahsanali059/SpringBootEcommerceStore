package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController
{
//	@RequestMapping("/bbb")
//	public ModelAndView openHelloPage()
//	{
//		ModelAndView mav = new ModelAndView("hello");
//		return mav;
//	}
	
	
	@RequestMapping("/bbb")
	public String openHelloPage()
	{
		return "hello";
	}
}



/*
public class HelloController implements Controller
{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0, HttpServletResponse arg1) throws Exception
	{
		ModelAndView mav = new ModelAndView("hello");
		return mav;
	}
}
*/