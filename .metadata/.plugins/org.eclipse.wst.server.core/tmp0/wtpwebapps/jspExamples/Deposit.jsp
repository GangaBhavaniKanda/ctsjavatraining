<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
int money=Integer.parseInt(request.getParameter("deposit_amount"));
String login_id=request.getParameter("login");
out.println(login_id);
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
String sql="update account set amount=amount+? where account_no=? ";
PreparedStatement pst=con.prepareStatement(sql);
if(money>0){
	
}
else
{
	out.println("Amount should not be negative values");
}
}
catch(Exception e){}

%>
</body>
</html>