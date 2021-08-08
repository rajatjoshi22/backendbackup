<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home.jsp</title>
<style>
tr {
  padding: 20px 0;
}
</style>
</head>
<body>
<%@ include file="loginheader.jsp" %>
<form action="choice" method="post">
<input type="text" name="choice" placeholder="Author/category/title" style="height:25px;width:300px;margin-top: 30px;">
<input type="submit" value="Search">
</form>
<h3>${errormessage}</h3>


<c:if test="${not empty bookList}">
    
      <table style="margin-top: 30px;margin-left: 50px;" >         
                    <tr>
                        <th>Title</th>
                        
                         <th>Category</th>
                        <th>Author</th>
       
                        
                    </tr>
     
    <c:forEach var="book" items="${bookList}" step="1">
    <form method="post">
                    <tr>
                        <td>${book.bookTitle}</td>
                        
                        <td>${book.bookCategory}</td>
                        <td>${book.bookAuthor}</td>
                    
                          <td><input type="hidden" name="bookId" value="${book.bookId}"></td>
                        <td><input type="submit" value="view" formaction="viewbook"/></td>
                    </tr>
                    </form>
                    </c:forEach>
                    </table>
  </c:if>

<%@ include file="footer.jsp" %>
</body>
</html>