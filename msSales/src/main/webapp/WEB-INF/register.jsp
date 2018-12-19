<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
    <link rel="stylesheet" type="text/css" href="/css/style.css">
</head>
<body>
	<h1> Welcome to Registration </h1>
	<div class="container">
    <div class="form">
	<form:form action="/users" method="POST" modelAttribute="user">
	    <form:label path="firstName">First Name:</form:label>
	    <form:errors path="firstName"></form:errors>
	    <form:input path="firstName"></form:input>

	    <form:label path="lastName">Last Name</form:label>
	    <form:errors path="lastName"></form:errors>
	    <form:input path="lastName"></form:input>

	    <form:label path="email">Email</form:label>
	    <form:errors path="email"></form:errors>
	    <form:input path="email"></form:input>

	    <form:label path="password">Password</form:label>
	    <form:errors path="password"></form:errors>
	    <form:input path="password"></form:input>

	    <form:label path="confirm">Confirm Password</form:label>
	    <form:errors path="confirm"></form:errors>
	    <form:input path="confirm"></form:input>

	    <input type="submit" value="Submit">
	</form:form>
	</div>
    </div>
</body>
</html>