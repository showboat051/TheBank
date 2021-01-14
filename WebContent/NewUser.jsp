<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewUser</title>
</head>
<body>
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
<h1>Welcome New User. You can sign up here</h1>

<div id="register"> 

<form action = "/login" method = "post">
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
</body>
</html>