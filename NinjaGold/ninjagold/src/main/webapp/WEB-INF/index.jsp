    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    

<%--  <c:out value="${//j}"/>  --%>

<!DOCTYPE html>
<html>
    <head>
    <meta charset="UTF-8">
    <title>Main Page</title>
    <link rel="stylesheet" type="text/css" href="/css/stylesheet.css">


</head>
<body>
<p>	My Value is	
<c:out value="${farm}" />
<c:out value="${cave}" />
<c:out value="${house}" />
<c:out value="${casino}" />
</p>

	<div class="container">
        <h1>Welcome to Dojo Survey!</h1>
        <div id="earnedGold">
            <p>Your Gold: <c:out value="${b}"/> </p>
        </div>
    <div class="subContainer">
  
        </div>
        <div class="goldBox">
            <form:form action="/farm" method="POST">
                <h2>Farm</h2>
                <p>(Ears 10-20 gold)</p>
                
                <button type="submit" name="farm" id="btn1" value="farm">Find Gold!</button>
                
            </form:form>
        </div>
        <div class="goldBox">
            <form:form action="/cave" method="POST">
            <h2>Cave</h2>
                <p>(Ears 5-10 gold)</p>
                <button type="submit" name="cave" value="cave" id="btn1">Find Gold! </button>
            </form:form>
        </div>
        <div class="goldBox">
            <form:form action="/house" method="POST">
            <h2>House</h2>
                <p>(Ears 2-5 gold)</p>
                <button type="submit" name="house" value="house" id="btn1">Find Gold! </button>
            </form:form>
        </div>
        <div class="goldBox">
            <form:form action="/casino" method="POST">
            <h2>Casino</h2>
                <p>(Ears 0-50 gold)</p>
                <button type="submit" name="casino" value="casino" id="btn1">Find Gold! </button>
            </form:form>
        </div>

        <div class="activities">
            <p id="pA">Activities: </p>
        </div>
        </div>

    </div>



</body>
</html>