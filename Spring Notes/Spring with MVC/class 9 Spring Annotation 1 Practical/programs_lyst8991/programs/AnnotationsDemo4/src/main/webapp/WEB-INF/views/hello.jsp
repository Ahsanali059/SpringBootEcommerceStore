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
		String myname = (String) request.getAttribute("nameObj");
	%>
	<h3> Hello (way 1) : <%= myname %> </h3>
	
	
	

	<h3> Hello (way 2) : <%= request.getAttribute("nameObj") %> </h3>
	
	
	
	<h3> Hello (way 3) : ${nameObj} </h3>
</body>
</html>