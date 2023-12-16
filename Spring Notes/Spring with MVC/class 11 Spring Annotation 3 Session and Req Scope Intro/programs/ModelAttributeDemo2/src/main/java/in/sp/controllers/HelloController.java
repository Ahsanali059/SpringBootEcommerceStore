package in.sp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController
{	
	@RequestMapping("/fff")
	public String m1()
	{
		System.out.println("m1() method executed");
		
		return "first";
	}
	
	@RequestMapping("/sss")
	public String m2()
	{
		System.out.println("m2() method executed");
		
		return "second";
	}
	
//	@ModelAttribute
//	public void modelData(Model model)
//	{
//		System.out.println("modelData() method executed");
//		
//		model.addAttribute("m_name", "deepak");
//		model.addAttribute("m_email", "deepak@gmail.com");
//	}
	
	
	@ModelAttribute("ma_name")
	public String modelData()
	{
		System.out.println("modelData() method executed");
		return "Deepak Panwar";
	}
}
