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
String login_id=request.getParameter("login");
String pswd=request.getParameter("pswd");
Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/cts","root","root");
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from account_user");
int flag=0;
while(rs.next()){
	if(login_id.equals(rs.getString(1)) && pswd.equals(rs.getString(2))){
		flag=1;
		
		break;
	}
}
if(flag==1){%>
	<jsp:include page="transactionMenu.html"/>
	<%
	int ch=Integer.parseInt(request.getParameter("choice"));
	out.println(ch);
	}

else{
	out.println("Invalid crendentials...");
%>
<!--  include action tag-->
	<jsp:include page="banklogin.html"/>
<%	
}
}
catch(Exception e){
		
}
%>
</body>
</html>