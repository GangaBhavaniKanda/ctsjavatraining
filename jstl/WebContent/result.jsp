<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
              <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- connecting to database -->
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver" 
url="jdbc:mysql://localhost/spring" user="root" password="root"/>

<%
try{
int price=0;
String bname=request.getParameter("bname");
session.setAttribute("name", bname);
DriverManager.deregisterDriver(new com.mysql.cj.jdbc.Driver());
Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement st=connection.createStatement();
ResultSet rs=st.executeQuery("select price from book where book_title="+bname);
if(rs.next()){
price=(int)rs.getInt(1);
out.println(bname+"  "+price +"Rs/-");
}

}
catch(Exception e){
	
}
%>
</body>
</html>