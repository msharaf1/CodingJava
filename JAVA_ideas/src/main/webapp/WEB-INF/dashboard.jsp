<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>dashboard</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<style>
.wrapper {
    min-height: 800px;
    width: 90%;
    margin: 0px auto;
    padding: 50px 40px;
    }
.flex-container {
    display: flex;
    justify-content: space-between;
    }
</style>
</head>
<body>
	<div class="wrapper"> 
		<div class="flex-container">
			<h1>Welcome, ${ user.name }</h1>
			<a href="/logout" id="logout">Logout</a>
		</div>
    	<div class="container">
	    	<div class="flex-container">
		    	<p>ideas</p>
		    	<div>
		    		<a href="#">Low Likes</a>
		    		<a href="#">High Likes</a>
		    	</div>
	    	</div>
        	<table class="table table-striped">
            	<thead class="thead-dark"">
                <tr>
                    <th>Ideas</th>
                    <th>Created By:</th>
                    <th>likes</th>
                    <th>Action</th>
                </tr>
            </thead>
            <c:if test="${ideas.size() > 0}">
            <tbody>
            <c:forEach items="${ideas}" var="idea">
		        <tr>
		            <td><a href="/ideas/${idea.id}"><c:out value="${ idea.content }"/></a></td>
		            <td>${ idea.creator.name}</td>
		            <td><c:out value="${ idea.getLikers().size() }"/></td>
		            <td>
		            <c:if test="${idea.likers.contains(user)}">
						<a href="/ideas/${idea.id}/unLike" >Unlike</a>
					</c:if>
 					<c:if test="${!idea.likers.contains(user)}">
						<a href="/ideas/${idea.id}/like" >Like</a>
					</c:if> 
		            </td>
		        </tr>
	        	</c:forEach> 
            </tbody> 
            </c:if>  
       	</table>
       	<a href="/ideas/new" class="btn btn-primary">Create an Idea</a>
    	</div>
    </div>
</body>
</html>