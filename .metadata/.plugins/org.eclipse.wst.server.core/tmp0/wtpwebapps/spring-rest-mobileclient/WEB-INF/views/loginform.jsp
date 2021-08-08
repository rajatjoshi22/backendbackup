<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>${message}</h1>
<form  action="login" method="post">
<table >
<tr>
<td>Enter LoginId</td>
<td><input type="text" name="loginId"></td>
</tr>
<tr>
<td>Enter Password</td>
<td><input type="password" name="password"></td>
</tr>
</table>
<input type="submit" value="Login">
</form>
<a href="signupForm">SignUp</a>
<a href="forgottenpassword">Forgotten password?</a>

<%@ include file="footer.jsp" %>
</body>
</html>