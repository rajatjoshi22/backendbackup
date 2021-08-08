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
<h1>Enter Book Price</h1>

<form action="editBook" method="post">
<table>
<tr>
<td>Enter bookTitle:</td>
<td><input type="text" name="bookTitle" value="${book.bookTitle}" readonly="readonly"></td>

</tr>
<tr>
<td>Enter bookId:</td>
<td><input type="number" name="bookId" value="${book.bookId}" readonly="readonly" ></td>

</tr>
<tr>
<td>Enter book category:</td>
<td><input type="text" name="bookCategory" value="${book.bookCategory}" readonly="readonly"></td>

</tr>
<tr>
<td>Enter book author:</td>
<td><input type="text" name="bookAuthor" value="${book.bookAuthor}" readonly="readonly"></td>

</tr>
<tr>
<td>Enter book Price:</td>
<td>
<input type="text" name="bookPrice" pattern="[0-9]+" placeholder="Enter new Price" title="Plzz Enter valid price">
</td>

</tr>
</table>
<input type="submit" value="EditBook">
</form>
<%@ include file="footer.jsp" %>
</body>
</html>