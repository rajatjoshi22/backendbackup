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
<div id="errormessage" style="color: red;"></div>
<form action="savePassword" method="post" name="passwordForm">
<h1 style="margin-left: 30px">Enter User Data</h1>
<table>
<tr>
<td>
Enter EmailId:
</td>
<td>
<input type="email" name="loginId" value="${user.loginId}" readonly="readonly">
</td>
</tr>
<tr>
<td>
Enter New Password:
</td>
<td>
<input type="password" name="password" id="pass" required="required">
</td>
</tr>
<tr>
<td>
Confirm New Password:
</td>
<td>
<input type="password" name="conpassword" id="conpass" required="required">
</td>
</tr>

</table>
<input type="button" id="btn" style="margin-left:120px;margin-top:25px" onclick="submitForm()" value="SavePassword">
</form>
<script type="text/javascript">
function submitForm(){
	
console.log("clicking");
var pass=document.getElementById("pass").value;
var conpass=document.getElementById("conpass").value;
if(pass===conpass){
	document.passwordForm.submit();
}else{
	document.getElementById("conpass").focus();
	document.getElementById("errormessage").innerHTML="new password and confirm password should be same";
}
}
</script>
</div>
<%@ include file="footer.jsp" %>
</body>
</html>