<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3> Register Form </h3>
	
	<form action="reg" method="post">
		Name : <input type="text" name="name" /> <br/> <br/>
		Email : <input type="text" name="email" /> <br/> <br/>
		Password : <input type="password" name="password" /> <br/> <br/>
		Gender : <input type="radio" name="gender" value="Male" />Male <input type="radio" name="gender" value="Female" />Female <br/> <br/>
		City : <select name="city">
					<option>Select City</option>
					<option>Chandigarh</option>
					<option>Delhi</option>
					<option>Mumbai</option>
				</select> <br/> <br/>
		<input type="submit" value="Register" />
	</form>
</body>
</html>