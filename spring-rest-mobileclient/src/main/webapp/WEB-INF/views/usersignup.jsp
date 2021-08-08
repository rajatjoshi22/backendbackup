<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
#container{
margin-left: 300px;
margin-top: 25px;
margin-bottom: 25px;
}
#btn:hover{
background-color: green;
color: white;
}
a {color:#FF0000;}     
a:visited {color:#00FF00;} 
a:hover {color:#FF00FF;}   
a:active {color:#0000FF;} 
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div id="container">
<form action="signup" method="post">
<h1 style="margin-left: 30px">Enter User Data</h1>
<table>
<tr>
<td>
Enter EmailId:
</td>
<td>
<input type="email" name="loginId" required="required">
</td>
</tr>
<tr>
<td>
Enter Password:
</td>
<td>
<input type="password" name="password" required="required">
</td>
</tr>
<tr>
<td>
Enter Name:
</td>
<td>
<input type="text" name="userName" required="required">
</td>
</tr>
<tr>
<td>
Enter MobileNo:
</td>
<td>
<input type="tel" name="mobileNumber" required="required">
</td>
</tr>
</table>
<input id="btn" style="margin-left:120px;margin-top:25px" type="submit" value="SignUp">
<div style="margin-left: 50px;margin-top: 20px;font-size: 20px;">Already Registered:<a href="loginForm" style="text-decoration: none">LogIn</a></div>
</form>

</div>
<%@ include file="footer.jsp" %>
</body>
</html>