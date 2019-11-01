<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify</title>
<link href="/css/stylesheet.css" rel="stylesheet">

</head>
<body>
    <div clas="mainContainer">
        <%-- <p>Welcome to Lookify!</p> --%>
        <div class="banner">
            <div class="barLinks"> 
                <a href="#"> Add New </a>
                <a href="#">Top Songs</a> </div>
            <div class="miniForm">
                <div class="inputField"> <input type="text" name="searchName" /></div>
                <div class="button"> <input type="submit" name="searchName" value="Search Artists" /> </div>
            </div>
        </div>
    </div>


</body>
</html>