
package in.sp.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller
{
    @Override
    public ModelAndView handleRequest(HttpServletRequest hsr, HttpServletResponse hsr1) throws Exception 
    {
        String name="Kamal Yadav";
        
//        ModelAndView mav = new ModelAndView("hello");
//        mav.addObject("nameObj", name);
        
        ModelAndView mav = new ModelAndView("hello", "nameObj", name);
        
        return mav;
    }
}
