
package in.sp.controllers;

import in.sp.services.RegisterService;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegisterController extends HttpServlet
{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
    {
        String name2 = req.getParameter("name1");
        String email2 = req.getParameter("email1");
        String pass2 = req.getParameter("pass1");
        String gender2 = req.getParameter("gender1");
        String city2 = req.getParameter("city1");
        
        String[] userArr = {name2, email2, pass2, gender2, city2};
        
        RegisterService regService = new RegisterService();
        boolean status = regService.insertUserDetailsService(userArr);
        if(status == true)
        {
            //resp.sendRedirect("success.html");
            
            req.setAttribute("message", "success");
            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            rd.include(req, resp);
        }
        else
        {
            //resp.sendRedirect("fail.html");
            
            req.setAttribute("message", "fail");
            RequestDispatcher rd = req.getRequestDispatcher("register.jsp");
            rd.include(req, resp);
        }
    }
}
