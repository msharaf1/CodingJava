<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DatePage</title>
		<title>HomePage</title>
        <link rel="stylesheet" type="text/css" href="css/style.css">
        <script type="text/javascript" src="js/date.js"></script>
        
</head>
<body>
	<h1>Welcome to Date Page </h1>
	<c:out value="${ Date }"/>
</html>