package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
	
	
//	@RequestMapping("/bbb")
//	public String openHelloPage()
//	{
//		return "hello";
//	}
	
	
	//incorrect
//	@RequestMapping("/aaa")
//	public String openHelloPage(int a)
//	{
//		return "hello";
//	}
	
	
//	@RequestMapping("/aaa")
//	public String openHelloPage(Integer a)
//	{
//		return "hello";
//	}
	
	
//	@RequestMapping("/aaa")
//	public String openHelloPage(String a)
//	{
//		return "hello";
//	}
	
	
	
	@RequestMapping("/aaa")
	public String openHelloPage(HttpServletRequest request, HttpServletResponse response)
	{
		return "hello";
	}
}