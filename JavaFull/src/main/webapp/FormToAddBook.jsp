 <%@page import="ua.com.foxminded.db.DatabaseFacade"%>
 <%@page import= "java.sql.Connection"%>
 <%@page import= "java.sql.DriverManager"%>
  <%@page import= "java.sql.Statement"%>
   

 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1> List with added Books </h1>








<% 

String newBook = request.getParameter("name");

DatabaseFacade.addBook(newBook);


try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/Books",
		"postgres", "1234")) {
	
	Statement statement = connection.createStatement();
	statement.executeUpdate("INSERT INTO books.books (\"NAME\") VALUES ( '" + newBook + "'  )");
	statement.close();
	connection.close();}



for (String name:DatabaseFacade.getBooks()){
	
	out.print (name + "<br/>" ); }



%>

   
</body>
</html>