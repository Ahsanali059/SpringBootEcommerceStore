<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Settings</title>
		<style>
			.header
			{
				height: 100px;
				width: 100%;
				background-color: black;
				float: left;
			}
			.inner_header
			{
				float: left;
				margin-left: 300px;
				margin-top: 35px
			}
			.menubar
			{
				color: white;
				text-decoration: none;
			}
			.selected_menubar
			{
				color: black;
				text-decoration: none;
				background-color: white;
				padding: 5px 
			}
			.logout_menubar
			{
				color: red;
				text-decoration: none;
			}
		</style>
	</head>
	<body style="margin: 0px">
		<div class="header">
			<div class="inner_header">
			
				<a href="home" class="menubar">Home</a>
				
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<a href="settings" class="selected_menubar">Settings</a>
				
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<a href="myprofile" class="menubar">My Profile</a>
				
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
				
				<a href="logout" class="logout_menubar">Logout</a>
				
			</div>
		</div>
		<div style="float: left;">
			<h2>Welcome to "Settings" page</h2> <br/>
			<h3>Welcome : ${s_name} </h3>
			<b> Email : </b> ${s_email} <br/> <br/>
			<b> Gender : </b> ${s_gender} <br/> <br/>
			<b> City : </b> ${s_city} <br/> <br/>
		</div>
	</body>
</html>