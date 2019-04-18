<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<style>
.wrapper {
    min-height: 800px;
    width: 1000px;
    margin: 0px auto;
    padding: 50px 10px;
}
#main {
    width: 100%;
    /* border: 1px solid slategray; */
    padding: 0px;
    display: flex;
    justify-content: space-between;
    border-radius: 5px;
}
.container {
    margin: 10px;
    border: 1px solid slategray;
    padding: 20px 10px;
}
#login {
    height: 350px;
    width: 60%;
}
#Reg {
    height: 550px;
}
legend.fix_border {
    width:auto; /* Or auto */
    padding:0 10px; /* To give a bit of padding on the left and right */
    border-bottom:none;
}
.form-control {
    border: 1px solid rgb(160, 160, 165);
}
.error {
    color: rgb(213, 63, 63);
    display: inline;
    font-size: 12px;
}
button {
    margin: 10px 40px;
    float: right;
}
</style>
</head>
<body>
	<div class='wrapper'>
       <h2>Title</h2>
       <div id='main'>
	<fieldset class="container" id="reg">
    <legend class="fix_border">Registration</legend>
    
   	<c:if test="${userError != null}" >
	<p class="error">${userError}</p>
	</c:if>
	
	<form:form action="/register" method="POST" modelAttribute="user" >
		<p>
        <form:label path="name">Name:</form:label>
        <form:errors path="name" class="error"></form:errors>
        <form:input path="name" class="form-control"></form:input>
        </p>
        <p>
         <form:label path="email">Email:</form:label>
        <form:errors path="email" class="error"></form:errors>
        <form:input path="email" class="form-control"></form:input>
        </p>
        <p>
        <form:label path="password">Password:</form:label>
        <form:errors path="password" class="error"></form:errors>
        <form:input path="password" class="form-control"></form:input>
        </p>
        <p>
        <form:label path="confirm">Confirm Password:</form:label>
        <form:errors path="confirm" class="error"></form:errors>
        <form:input path="confirm" class="form-control"></form:input>
        </p>
        <input type="submit" class="btn btn-primary" value="Register" />
	</form:form>
	</fieldset>
	
	<fieldset class="container" id="login">
    <legend class="fix_border">Login</legend>
	<c:if test="${loginError != null}" >
		<p class="error">${loginError}</p>
	</c:if>
	<form action="/login" method="POST">
		<div class="form-group">
        	<label>Email</label>
        	<input type="text" class="form-control" name="email" placeholder="Email"/>
        </div>
        <div class="form-group">
        	<label>Password</label>
        	<input type="password" class="form-control" name="password" placeholder="Password"/>
        </div>
        <input type="submit" class="btn btn-primary" value="Login"/>
      </form>
      </fieldset>
	
    </div>
</div>
	
	
</body>
</html>