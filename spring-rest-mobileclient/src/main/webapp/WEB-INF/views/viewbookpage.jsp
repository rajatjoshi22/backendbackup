<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
#backgroundimage{
            background-image: url('https://images.unsplash.com/photo-1507842217343-583bb7270b66?ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8bGlicmFyeXxlbnwwfHwwfHw%3D&ixlib=rb-1.2.1&w=1000&q=80');
            background-repeat: no-repeat;
            background-size: 100%;
           /*  filter:alpha(opacity=40); */
            height:110%;
            width:110%;
            z-index:0.1;
        
}
#container{
border: 1px solid black; 
height: 450px;
width:300px;
margin-top: 15px;
margin-left: 250px;
margin-bottom: 40px;
background-color:#E95B5B;
border-radius: 20px; 

}
*{
top: 0px;
bottom: opx;
}
#image{
/* border:2px solid red; */
height:150px;
width:150px;
margin-top:25px;
margin-left: 75px;
}
img{
margin-top:15px;
height:148px;
width:148px;
}
h3{
margin-left: 80px;
}
.btn{
margin-left: 43px;
margin-top: 20px;
height:35px;
width:95px;
border-radius: 10px;
background-color: pink;
}
.btn:hover {
	background-color:#FF33FF;
	text-transform: uppercase;
}
</style>
</head>
<body>
<%@ include file="header.jsp" %>
<div id="backgroundimage">
<button class="btn" style="margin-left: 0px;margin-top: 0px" onclick="location.href='home'">Home</button>
 <div id="container"> 

 <div id="image">
  <img  src="https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1347642664l/1188948.jpg">
 </div>
 <h3>${book.bookTitle}</h3>
 <h3>${book.bookAuthor}</h3>
 <h3>${book.bookCategory}</h3>
 <input class="btn" type="submit" value="E-Book">
  <input class="btn" type="submit" value="AddToCart"><br>
 <input class="btn" type="submit" value="Pay ${book.bookPrice}" style="margin-left: 110px;">
 </div>
<%@ include file="footer.jsp" %>
</div>
</body>
</html>