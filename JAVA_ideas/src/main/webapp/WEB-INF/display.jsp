<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.2/css/bootstrap.min.css">
<style>
.wrapper {
    min-height: 800px;
    width: 90%;
    margin: 0px auto;
    padding: 50px 40px;
    }
.width {
	width: 30%;
	margin: 20px 0px;
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
			<h1>${ idea.content }</h1>
			<a href="/ideas">home</a>
		</div>
    	<div class="container">
    		<div class='flex-container width'>
		    	<h4>Created by:</h4>
		     	<h4>${idea.creator.name}</h4>    		
    		</div>
        	<table class="table table-striped">
            	<thead class="thead-dark">
                	<tr>
                    	<th>Name</th>
                	</tr>
            	</thead>
            	<tbody>
            	<c:forEach items="${likers}" var="liker">
		        	<tr>
		            	<td><c:out value="${ liker.name }"/></td>
		        	</tr>
	        	</c:forEach> 
            	</tbody>  
       		</table>
       	<a href="/ideas/${idea.id}/edit" class="btn btn-primary">Edit</a>
    	</div>
    </div>

</body>
</html>