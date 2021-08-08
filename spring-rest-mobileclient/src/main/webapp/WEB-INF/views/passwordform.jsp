<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddBook</title>
</head>
<body>
<%@ include file="header.jsp" %>
<h1>Enter Your LoginId</h1>
<h3>${message}</h3>
<form action="resetpassword" method="post">
<table>
<tr>
<td>Enter LoginId:</td>
<td><input type="email"  name="loginId" placeholder="ABC@gmail.com" ></td>

</tr>

</table>
<input type="submit" value="ResetPassword">
</form>
<%@ include file="footer.jsp" %>
</body>
</html>