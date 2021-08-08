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
<h1>Enter Book Id for Deletion</h1>
<h3>${message}</h3>
<form action="deleteBook" method="post">
<table>
<tr>
<td>Enter bookId:</td>
<td><input type="text" pattern="[0-9]+" name="bookId" placeholder="Enter book Id" title="Plzz Enter Integer Id"></td>

</tr>

</table>
<input type="submit" value="DeleteBook">
</form>
<%@ include file="footer.jsp" %>
</body>
</html>