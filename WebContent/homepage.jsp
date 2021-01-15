<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the Bank!</h1>

<div id="login"> 
New Users Register  <a href = "http://localhost:8089/TheBank/login"> Here</a>

<form action = "<%= request.getContextPath() %>/UserServlet" method = "post">
         First Name: <input type = "text" name = "firstname"/>
         <br />
         Last Name: <input type = "text" name = "lastname" />
         <input type = "submit" value = "Login" />
      </form>
      
      <% 
      Date date = new Date(); 
      out.print("<h2>" + date.toString() + "</h2>");
      %>

</div>

</body>
</html>