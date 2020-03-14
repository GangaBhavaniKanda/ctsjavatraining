<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

<!-- Executiong select query -->
<sql:query dataSource="${db}" var="resultset">
select * from book;
</sql:query>

<table border="1">
<tr><th>book_title</th><th>author</th><th>publisher</th><th>year_of_publication</th><th>price</th></tr>
<c:forEach var="table_row" items="${resultset.rows}">
<tr>
<td><c:out value="${table_row.book_title}"/></td>
<td><c:out value="${table_row.author}"/></td>
<td><c:out value="${table_row.publisher}"/></td>
<td><c:out value="${table_row.year_of_publication}"/></td>
<td><c:out value="${table_row.price}"/></td>
</tr>
</c:forEach>
</table>
<form action="result.jsp">
Enter Book_name:<input type="text" name="bname">
<input type="submit" value="select">
</form>
</body>
</html>