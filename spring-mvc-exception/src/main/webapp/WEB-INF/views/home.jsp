<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home page</title>
</head>
<body>
<h3>${message}</h3>
<form action="getByCity">
Enter City:<input type="text" name="city" placeholder="Enter  city">
<input type="submit" value="Serach">
</form>
<form action="getById">
Enter StudentId:<input type="text" name="studentId" placeholder="Enter studentId">
<input type="submit" value="Serach">
</form>
<c:forEach var="student" items="${studentList}">
<h3>${student.studentName}  ${student.studentId} ${student.city}</h3>

</c:forEach>

<h3>${student.studentName}  ${student.studentId}  ${student.city}</h3>
</body>
</html>