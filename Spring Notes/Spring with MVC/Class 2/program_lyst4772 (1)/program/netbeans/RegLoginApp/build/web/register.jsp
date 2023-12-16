<%-- 
    Document   : register
    Created on : 27 Dec, 2022, 7:49:53 AM
    Author     : Deepesh Panwar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h3> Registration Form </h3>
        
        <%
            String mymessage = (String) request.getAttribute("message");
            if(mymessage != null)
            {
                if(mymessage.equals("success"))
                {
                    out.print("<p style=\"color:green\"> user registered successfully </p>");
                }
                else
                {
                    out.print("<p style=\"color:red\"> user not registered due to some error </p>");
                }
            }
        %>
        
        <form method="post" action="reg">
            Name : <input type="text" name="name1" /> <br/> <br/>
            Email : <input type="text" name="email1" /> <br/> <br/>
            Password : <input type="password" name="pass1" /> <br/> <br/>
            Gender : <input type="radio" name="gender1" value="Male" /> Male <input type="radio" name="gender1" value="Female" /> Female <br/> <br/>
            City : <select name="city1">
                        <option>Select City</option>
                        <option> Chandigarh </option>
                        <option> Delhi </option>
                        <option> Banglore </option>
                        <option> Mumbai </option>
                   </select> <br/> <br/>
            <input type="submit" value="Register" />
        </form>
        
    </body>
</html>
