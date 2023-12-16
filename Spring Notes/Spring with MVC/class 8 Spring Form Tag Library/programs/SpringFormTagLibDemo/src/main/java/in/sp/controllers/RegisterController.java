package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

import in.sp.beans.Student;

public class RegisterController extends SimpleFormController
{
//	@Override
//	protected ModelAndView onSubmit(HttpServletRequest request, HttpServletResponse response, Object command, BindException errors) throws Exception
//	{
//		Student std = (Student) command;
//		ModelAndView mav = new ModelAndView("profile", "stdObj", std);
//		return mav;
//	}
	
	@Override
	protected ModelAndView onSubmit(Object command) throws Exception
	{
		Student std = (Student) command;
		ModelAndView mav = new ModelAndView("profile", "stdObj", std);
		return mav;
	}
}