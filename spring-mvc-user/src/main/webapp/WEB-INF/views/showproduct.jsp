<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show product</title>
</head>
<body>
<h3>${message}</h3>
<c:forEach var="product" items="${product}" step="1">
            <h3>${product}</h3>
                    
                    
                    </c:forEach>
                   
</body>
</html>