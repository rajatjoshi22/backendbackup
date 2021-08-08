<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Form</title>
</head>
<body>
<h1>${errormessage}</h1>
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
<input type="submit" value="Submit">
</form>
</body>
</html>