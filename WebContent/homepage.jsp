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
Returning Users Log in Here
<form action="loginPage" modelAttribute="User">
	
	ID: <form:input path="userId" />
	<br><br>
	
	UserName: <form:input path="username" />
	</form>
</form>
</div>

</body>
</html>