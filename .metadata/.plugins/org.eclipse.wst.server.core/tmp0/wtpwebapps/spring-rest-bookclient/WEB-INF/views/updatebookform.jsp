<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>AddBook</title>
</head>
<body>
<%@ include file="logoutheader.jsp" %>
<h1>Enter Book Id for Updation</h1>
<h3>${message}</h3>
<form action="updateBook" method="post">
<table>
<tr>
<td>Enter bookId:</td>
<td><input type="text" name="bookId"  pattern="[0-9]+" title="Plzz Enter Integer Id" placeholder="Enter book Id"></td>

</tr>
</table>
<input type="submit" value="UpdateBook">
</form>
<%@ include file="footer.jsp" %>
</body>
</html>