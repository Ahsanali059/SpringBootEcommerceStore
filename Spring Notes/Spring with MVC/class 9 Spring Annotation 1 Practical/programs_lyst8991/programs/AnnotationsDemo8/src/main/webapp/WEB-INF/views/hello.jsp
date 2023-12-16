<%@page import="in.sp.beans.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<%
		Student std = (Student) request.getAttribute("stdObj");
	%>
	<h3> Hello : <%= std.getName() %> ------ <%= std.getEmail() %> </h3>
	
</body>
</html>