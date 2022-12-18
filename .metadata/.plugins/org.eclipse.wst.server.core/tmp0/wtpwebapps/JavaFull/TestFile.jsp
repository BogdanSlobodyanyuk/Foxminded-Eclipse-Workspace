<%@page import="ua.com.foxminded.db.DatabaseFacade"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

        <p>Name: <%= request.getParameter("name") %></p>
        
        <% String newBook = request.getParameter("name");
        
        DatabaseFacade.getBooks();
        
        out.print(DatabaseFacade.getBooks());
     
        
        
        
        %>

</body>
</html>