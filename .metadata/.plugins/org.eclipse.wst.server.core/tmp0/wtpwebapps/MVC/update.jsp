<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="data.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
Employee e=(Employee)request.getAttribute("emp");
%>

Enter Emp_Id:<input type="text" name="id" value=><br>
<input type="submit" value="submit">
	<table>
	<tr><td>Name</td><td><input type="text" name="name" value=<%=e.getEmp_name() %>></td></tr>
	<tr><td>Department</td><td><input type="text" name="dept"  value=<%=e.getDept() %>></td></tr>
	<tr><td>Designation</td><td><input type="text" name="company"  value=<%=e.getDesg() %>></td></tr>
	<tr><td>E-mail</td><td><input type="text" name="email"  value=<%= e.getEmail() %>></td></tr>
	<tr><td><input type="submit" value="Update"></td></tr>
	</table>
	
</body>
</html>