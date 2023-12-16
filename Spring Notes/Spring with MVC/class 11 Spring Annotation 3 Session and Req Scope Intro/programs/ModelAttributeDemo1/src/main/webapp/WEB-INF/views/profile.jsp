<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h3> Welcome : ${m_student.getName()} </h3>
	
	<b> Email : </b> ${ma_student.getEmail()} <br/> <br/>
	<b> Gender : </b> ${ma_student.getGender()} <br/> <br/>
	<b> City : </b> ${ma_student.getCity()} <br/> <br/>
	
</body>
</html>