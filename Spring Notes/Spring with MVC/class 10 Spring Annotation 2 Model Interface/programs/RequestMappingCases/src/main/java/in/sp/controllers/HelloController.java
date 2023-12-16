package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/aaa")
public class HelloController
{
	//@RequestMapping("/aaa")
	
	//@RequestMapping(value="/aaa")
	
	//@RequestMapping(value={"/aaa","/bbb","/ccc"})
	
	//@RequestMapping(value="/aaa", method=RequestMethod.GET)
	
	//@RequestMapping(value="/aaa", method= {RequestMethod.GET, RequestMethod.POST})
	
	@RequestMapping("/bbb")
	public String m1()
	{
		System.out.println("hello controller....");
		return "hello";
	}
}
