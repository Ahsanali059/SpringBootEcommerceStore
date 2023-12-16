package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController
{
	@RequestMapping("/aaa")
	public String m1(
			@RequestParam(name="name1") String myname,
			@RequestParam(name="email1") String myemail,
			@RequestParam(name="pass1") String mypass,
			@RequestParam(name="city1", required = false, defaultValue = "Delhi") String mycity
		)
	{
		//String myname = request.getParameter("name1");
		System.out.println("hello : "+myname+", your email id is "+myemail+" and city is "+mycity);
		return "hello";
	}
}
