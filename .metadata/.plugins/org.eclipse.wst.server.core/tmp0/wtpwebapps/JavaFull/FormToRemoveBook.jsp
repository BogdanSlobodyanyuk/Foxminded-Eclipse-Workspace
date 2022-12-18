 <%@page import="ua.com.foxminded.db.DatabaseFacade"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page import= "java.sql.Connection"%>
 <%@page import= "java.sql.DriverManager"%>
  <%@page import= "java.sql.Statement"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> List without remove Books </h1>

<% 

String oldBook = request.getParameter("name");

try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Books",
		"postgres", "1234")) {
	
	Statement statement = connection.createStatement();
	statement.executeUpdate("DELETE FROM books.books WHERE (\"NAME\") = '"+ oldBook +"'");
	statement.close();
	connection.close();}



for (String name:DatabaseFacade.getBooks()){
	
	out.print (name + "<br/>" ); } %>
	
	
</body>
</html>