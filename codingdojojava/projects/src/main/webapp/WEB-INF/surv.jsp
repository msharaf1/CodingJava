<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>Survey Page</title>

  </head>  
  <body>
  <h1>What is your favorte language</h1>
    <form action="add" method="post"></p>
        <p><input type="text" name="name" /></p>
        <p><input type="text" name="language" /></p>
        <p><input type="text" name="location" /></p>
       <p> <input type="textarea" name="comment" placeholder="comments" />

        <p><input type="submit"/></p>

    </form>

  </body>
</html>