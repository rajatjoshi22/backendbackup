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
<form action="search-by-Brand" >
<input type="text" name="brand" placeholder="Search by brand" style="height:25px;width:300px;margin-top: 30px;">
<input type="submit" value="Search">
</form>
<form action="search-by-BrandandModel" >
<input type="text" name="brand" placeholder="Enter brand" style="height:25px;width:300px;margin-top: 30px;">
<input type="text" name="model" placeholder="Enter Model" style="height:25px;width:300px;margin-top: 30px;">
<input type="submit" value="SearchAll">
</form>
<form action="search-by-id">
Enter mobileId:<input type="text" name="mobileid" placeholder="Enter mobile id"><br>
<input type="submit" value="Submit">
</form>
<form method="post" action="mobiles">
Enter mobileId:<input type="text" name="mobileid" placeholder="Enter mobile id"><br>
Enter Model:<input type="text" name="model" placeholder="Enter mobile model"><br>
Enter Brand:<input type="text" name="brand" placeholder="Enter mobile brand"><br>
Enter Price:<input type="text" name="price" placeholder="Enter mobile Price"><br>
<input type="submit" value="Submit">
</form>

<c:if test="${not empty mobileList}">
    
      <table style="margin-top: 30px;margin-left: 50px;" >         
                    <tr>
                        <th>Model</th>
                        
                         <th>Brand</th>
                        <th>Price</th>
       
                        
                    </tr>
     
    <c:forEach var="mobile" items="${mobileList}" step="1">
  
                    <tr>
                        <td>${mobile.model}</td>
                        
                        <td>${mobile.brand}</td>
                        <td>${mobile.price}</td>
                    
              
                    </tr>
                   
                    </c:forEach>
                    </table>
  </c:if>

<%@ include file="footer.jsp" %>
</body>
</html>