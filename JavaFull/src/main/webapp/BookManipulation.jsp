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
<h1> List Of my Books </h1>

<%

for (String name:DatabaseFacade.getBooks()){
	
	out.print (name + "<br/>" ); }


%>


	
	<form action="FormToAddBook.jsp" >
	
	
	<h1> Html's Form for Add Books </h1>
	
	
	
	<br/>
	<input name = "name"> 
	<input type = "submit" value = "Добавити книгу">
	
	</form>
	
	
	<form action = "TestFile.jsp" >
	
	   <br><br>
	      <br><br>
	
	
	  Name: <input name="name" />
	  
	  
    <br><br>
    
    <input type="submit" value="Submit" />
	
	
	</form>
	
	
	
	
	
	<form action = "FormToRemoveBook.jsp">
	
	<h1> Html's Form for Remove Books </h1>
	
	
	
	<br/>
	<input name = "name"> 
	<input type = "submit" value = "Видалити книгу">
	
	
	 </form>
	
   
</body>
</html>