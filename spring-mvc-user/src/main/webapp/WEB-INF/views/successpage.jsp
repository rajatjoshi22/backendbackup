<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
welcome ${user.loginId}
</h1>
<c:forEach var="product" items="${product}" step="1">
            <h3>${product}</h3>
                    
                    
                    </c:forEach>
<form action="showItems" method="get">
Select Catagory:<select name="catagory" style="height:40px;width: 150px" >
  <option value="electronics">Electronics</option>
  <option value="sports">Sports</option>
  <option value="clothes">Clothes</option>
</select>

<input type="submit" value="Search" style="height:40px;width: 70px">
</form>
</body>
</html>