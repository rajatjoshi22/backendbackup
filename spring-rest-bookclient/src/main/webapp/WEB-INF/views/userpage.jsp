<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UserPage</title>
</head>
<body>
<%@ include file="logoutheader.jsp" %>
<h3>Welcome ${user.userName}</h3>
<c:if test="${not empty bookList}">
    
      <table style="margin-top: 30px;margin-left: 50px;" >         
                    <tr>
                        <th>Title</th>         
                         <th>Category</th>
                        <th>Author</th>
                        <th>Price</th>
                        
                    </tr>
     
    <c:forEach var="book" items="${bookList}" step="1">
    <form method="post">
                    <tr>
                        <td>${book.bookTitle}</td>
                       <td>${book.bookCategory}</td>
                        <td>${book.bookAuthor}</td>
                        <td>${book.bookPrice}</td>
                          <td><input type="hidden" name="bookId" value="${book.bookId}"></td>
                        <td><input type="submit" value="view" formaction="userviewbook"/></td>
                    </tr>
                    </form>
                    </c:forEach>
                    </table>
  </c:if>
<%@ include file="footer.jsp" %>
</body>
</html>