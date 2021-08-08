<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin Page</title>
<style type="text/css">
a{
margin-left: 20px;
margin-top: 20px;
}
</style>
</head>
<body>
<%@ include file="logoutheader.jsp" %>
<h3>${message}</h3>
<a href="addBookForm">AddBook</a>
<a href="updateBookForm">UpdateBook</a>
<a href="deleteBookForm">DeleteBook</a>
<%@ include file="footer.jsp" %>
</body>
</html>