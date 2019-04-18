<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Create Idea</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<style>
.wrapper {
    min-height: 800px;
    width: 90%;
    margin: 0px auto;
    padding: 50px 40px;
    }
#create {
	width: 50%;
	}
.flex-container {
    display: flex;
    justify-content: space-between;
    }
.error {
    color: rgb(213, 63, 63);
    display: inline;
    font-size: 12px;
	}
</style>
</head>
<body>
	<div class="wrapper">
		<div class="flex-container">
		<h3>Create a new idea</h3>
		<a href="/ideas">home</a>
		</div>
		<c:if test="${errors != null}">
			<p class="error">${errors}</p>
		</c:if> 
		<form:form method="post" action="/ideas/new" modelAttribute="idea">
			<div class="form-group">
				<form:label path="content">Content:</form:label>	
                <form:errors path="content" class="error"></form:errors>		
                <form:input path="content" class="form-control"></form:input>
			</div>
			<input type="submit" class="btn btn-primary" value="Create"/>
	  	</form:form>
	  	
	  	
	</div>
</body>
</html>