<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.util.*,data.Employee"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Employee Information
<table border="1" width="90%">
<tr><td>emp_id</td><td>emp_name</td><td>dept</td><td>desg</td><td>email</td></tr>
<%
List<Employee>list=(List<Employee>)request.getAttribute("list"); 
%>
<c:set var="list1" value="${list}"></c:set>
<c:forEach items="${list1}" var="row">
<tr><td>${row.emp_id}</td><td>${row.emp_name}</td><td>${row.dept}</td><td>${row.desg}</td><td>${row.email}</td></tr>
<!-- <tr><td>${row.getEmp_id()}</td><td>${row.getEmp_name()}</td><td>${row.getDept()}</td><td>${row.getDesg()}</td><td>${row.getEmail()}</td></tr> -->
</c:forEach>
</table>
</body>
</html>