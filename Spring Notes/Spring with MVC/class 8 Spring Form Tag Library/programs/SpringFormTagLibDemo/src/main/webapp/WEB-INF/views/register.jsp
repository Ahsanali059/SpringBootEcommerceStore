<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Register Here</title>
</head>
<body>
	<h3> Register Here </h3>
	
	<form:form method="post" action="reg" commandName="stdCommand">
		Name : <form:input path="name"/> <br/> <br/>
		Email : <form:input path="email"/> <br/> <br/>
		Password : <form:password path="password"/> <br/> <br/>
		Gender : <form:radiobutton path="gender" label="Male" value="Male" />
				 <form:radiobutton path="gender" label="Female" value="Female" /> <br/> <br/>
		City : <form:select path="city">
					<form:option value="Select City" label="Select City" />
					<form:option value="Chandigarh" label="Chandigarh" />
					<form:option value="Delhi" label="Delhi" />
					<form:option value="Mumbai" label="Mumbai" />
				</form:select> <br/> <br/>
		<input type="submit" value="Register" />
	</form:form>
	
</body>
</html>