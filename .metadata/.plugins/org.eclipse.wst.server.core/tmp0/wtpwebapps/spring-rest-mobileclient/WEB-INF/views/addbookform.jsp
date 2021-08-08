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
<h1>Enter Book Details</h1>
<h3>${message}</h3>
<form action="addBook" method="post">
<table>
<tr>
<td>Enter bookTitle:</td>
<td><input type="text" name="bookTitle" placeholder="Enter book title"></td>

</tr>
<tr>
<td>Enter bookId:</td>
<td><input type="number" name="bookId" placeholder="Enter book Id"></td>

</tr>
<tr>
<td>Enter book category:</td>
<td><input type="text" name="bookCategory" placeholder="Enter book Category"></td>

</tr>
<tr>
<td>Enter book author:</td>
<td><input type="text" name="bookAuthor" placeholder="Enter book Author"></td>

</tr>
<tr>
<td>Enter book Price:</td>
<td>
<input type="number" name="bookPrice" placeholder="Enter book Price">
</td>

</tr>
</table>
<input type="submit" value="AddBook">
</form>
<%@ include file="footer.jsp" %>
</body>
</html>