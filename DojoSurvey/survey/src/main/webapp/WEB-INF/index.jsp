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

<style>
	.content {
  		margin: auto;
}
</style>

</head>
<body>
	<div class="content">
    <h1>Welcome to Dojo Survey!</h1>
		
        <h2><span style="color:maroon">You Must Train Harder!</span></h2>
		<h2>What is the code?</h2>



        <div class="form1">
            <form action="/result" method="POST">
                <label for="name">Your Name: </label>
                <input type="text" name="fullname" placeholder="Your name" />
                <br>
                <label for="dojoLocations">Dojo Locations: </label>
                <input type="text" name="dojoLocations" id="dojoLocations" placeholder="Chose your favorite Language" />
                <br>


        <p>Language Name: 
            <select name="progList">
                <option>Python</option>
                <option>Java</option>
                <option>JavaScript</option>
                <option>Julia</option>
            </select>

        </p>
                <br><br>
                <input type="submit" value="Submit">

            </form>
        </div>
	</div>

</body>
</html>