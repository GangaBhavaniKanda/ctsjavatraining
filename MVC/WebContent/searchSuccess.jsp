<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="data.Employee"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Record Found....
<%
Employee emp = (Employee) request.getAttribute("emp");
%>
<c:set var="row" value="${emp}"></c:set>
<table border="1" width="90%">
<tr><td>emp_id</td><td>emp_name</td><td>dept</td><td>desg</td><td>email</td></tr>
<tr><td>${row.emp_id}</td><td>${row.emp_name}</td><td>${row.dept}</td><td>${row.desg}</td><td>${row.email}</td></tr>
</table>
</body>
</html>