<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<style>
			.myerrors
			{
				color:red;
			}
		</style>
	</head>
	<body>
		<h3> Register Form </h3>
		
		<form:form action="regForm" method="POST" modelAttribute="std">
			Name : <form:input path="name"/> <form:errors path="name" cssClass="myerrors" /> <br/> <br/>
			Email : <form:input path="email"/> <form:errors path="email" cssClass="myerrors" /> <br/> <br/>
			Password : <form:password path="password"/> <form:errors path="password" cssClass="myerrors" /> <br/> <br/>
			Gender : <form:radiobutton path="gender" label="Male" value="Male"/>
					 <form:radiobutton path="gender" label="Female" value="Female"/>
					 <form:errors path="gender" cssClass="myerrors" /> <br/> <br/>
			City : <form:select path="city">
						<form:option value="Chandigarh" label="Chandigarh" />
						<form:option value="Mumbai" label="Mumbai" />
						<form:option value="Delhi" label="Delhi" />
					</form:select>
					<form:errors path="city" cssClass="myerrors" /> <br/> <br/>
			<input type="submit" value="Register" />
		</form:form>
		
	</body>
</html>