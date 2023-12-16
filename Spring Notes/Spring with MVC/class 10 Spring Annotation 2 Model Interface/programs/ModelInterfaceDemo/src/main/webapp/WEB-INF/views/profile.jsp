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
		String name = (String) request.getAttribute("m_name");
		String email = (String) request.getAttribute("m_email");
	%>
	<h3> Hello <%= name %>.... </h3>
	<h3> Email : <%= email %> </h3>
</body>
</html>