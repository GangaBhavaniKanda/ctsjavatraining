<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!

int i=1,fact=1;
public int factorial(int n){
	for(int i=1;i<=n;i++)
		fact=fact*i;
	return fact;
}

int res=factorial(5);

%>
<%out.println(res); %>



</body>
</html>