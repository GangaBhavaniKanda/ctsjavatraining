<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
a{
	text-decoration:none;
	color:black;
}
tr:hover{background-color: red;}
table {
	background-color:#E9EBEE;
	width:15%;
  border-collapse: collapse;
}
table, th, td {
	margin-top:2%;
  border: 2px solid black;
  text-align:center;
  font-color:black;
}
image{
	width:1000px;
	height:100px;
	margin-bottom:2%;
}
</style>
</head>
<body>
<div><img src="D:\training.PNG"></div>
UserType :<%out.println(request.getAttribute("type"));%><br>
Welcome to Training
<table>
<tr><td><a href="home.jsp">Home</a></td></tr>
<tr><td><a href="AddEmployeeServ.java">Add Employee</a></td></tr>
<tr><td><a href="UpdateEmployeeServ.java">Update Employee</a></td></tr>
<tr><td><a href="DeleteEmployeeServ.java">Delete Employee</a></td></tr>
</table>
</body>
</html>