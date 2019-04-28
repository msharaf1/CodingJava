<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-04-24
  Time: 20:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Show Ideas</title>
</head>
<body>
  <div class="container">
    <h1> Posted Idea! <c:out value="${post.id}"/> || <c:out value="${post.postName}"/></h1>
    <a href="/posts">Home</a>
   
  
  
  </div>

  <%-- <h1><c:out value="${post.postName}"/></h1>

  <a href="/books/${book.id}/edit">Edit Book</a>

<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form> --%>







<%-- <h1><c:out value="${book.title}"/></h1>
      <p>Description: <c:out value="${book.description}"/></p>
      <p>Language: <c:out value="${book.language}"/></p>
      <p>Number of pages: <c:out value="${book.numberOfPages}"/></p>
      <a href="/books/${book.id}/edit">Edit Book</a>
      
<form action="/books/${book.id}" method="post">
    <input type="hidden" name="_method" value="delete">
    <input type="submit" value="Delete">
</form> --%>


</body>
</html>
