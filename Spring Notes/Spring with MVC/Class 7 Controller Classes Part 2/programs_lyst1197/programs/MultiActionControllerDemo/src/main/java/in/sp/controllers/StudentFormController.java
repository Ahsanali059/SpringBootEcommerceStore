package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class StudentFormController extends MultiActionController
{
	public ModelAndView addStudent(HttpServletRequest request, HttpServletResponse response)
	{
		//----------business logic---------------
		
		ModelAndView mav = new ModelAndView("profile", "message", "Student Added Successfully");
		return mav;
	}
	
	public ModelAndView updateStudent(HttpServletRequest request, HttpServletResponse response)
	{
		//----------business logic---------------
		
		ModelAndView mav = new ModelAndView("profile", "message", "Student Updated Successfully");
		return mav;
	}
	
	public ModelAndView deleteStudent(HttpServletRequest request, HttpServletResponse response)
	{
		//----------business logic---------------
		
		ModelAndView mav = new ModelAndView("profile", "message", "Student Deleted Successfully");
		return mav;
	}
}
