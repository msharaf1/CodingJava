<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CounterPage</title>
</head>
<body>
	<h1>Welcome Dear User: </h1>
	<h1><c:out value="${count}"/></h1>
	
	<a href="/counter">Count more...</a>
	<hr><br>
	<a href="/">Go back to Home page</a>

</body>
</html>