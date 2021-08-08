<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>EmpForm</title>
</head>
<body>
<form action="addEmployee" method="get">
<table>
<tr>
<td>Enter Name:</td>
<td><input type="text" name="empName" placeholder="Enter Your Name"></td>
</tr>
<tr>
<td>Enter empId:</td>
<td><input type="text" name="empId" placeholder="Enter Your Id"></td>
</tr>
<tr>
<td>Enter City:</td>
<td><input type="text" name="empCity" placeholder="Enter Your City"></td>
</tr>

</table>
<input type="submit" value="AddEmployee">
</form>
</body>
</html>