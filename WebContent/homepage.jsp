<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to the Bank!</h1>

<div id="login"> 
Returning Users Log in  <a href = "/login"> Here</a>

<form action = "homepage.jsp" method = "GET">
         First Name: <input type = "text" name = "firstname">
         <br />
         Last Name: <input type = "text" name = "lastname" />
         <input type = "submit" value = "Submit" />
      </form>

</div>

</body>
</html>