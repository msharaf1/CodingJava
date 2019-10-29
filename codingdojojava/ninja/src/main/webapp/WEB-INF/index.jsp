<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Ninja Gold</title>
</head>
<body>
    <div clas="mainContainer">

        <h1> Your Gold: <c:out value="${earnedGold}"/> </h1>
        
        <div class="forms">
            <div id="farm">
            <div id="result">
                
            </div>
                <form action="/" method="post">
                    <input type="hidden" name="gold" value="farm">
                    <button name="farmButton">Find Gold!</button>
                </form>
            </div>
            <div id="cave">
            <form action="/" method="post">
                <input type="hidden" name="gold" value="cave">
                <button name="cave">Find Gold!</button>
                </form>
            </div>
            <div id="house">
              <form action="/" method="post">
                <input type="hidden" name="gold" value="house">
                <button name="house">Find Gold!</button>
                </form>
            </div>
            <div id="casino">
            <form action="/" method="post">
                <input type="hidden" name="gold" value="casino"> 
                <button name="casino">Find Gold!</button>
            </form>
            </div>


            <button name="reset"><a href="./reset"> Reset </button>
        </div>

        <div clas="activity">
        </div>
    </div>


</body>
</html>