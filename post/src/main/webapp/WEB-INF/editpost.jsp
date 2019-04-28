<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-04-24
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page isErrorPage="true" %>
<!DOCTYPE html>
<head>
    <title>Post and Idea!</title>
</head>
<body>


<h1>edit Idea!</h1>
<p><form:errors path="post.*"/></p>
<form:form action="/posts/${post.id}" method="POST" modelAttribute="post">
<input type="hidden" name="_method" value="put">
    <p>
    <form:label path="postName">Edit This Idea: </form:label>
       <%-- <form:errors path="postName"></form:errors> --%>
       <form:input path="postName"/>
    </p> 


    <input type="submit" value="Submit"/>
</form:form>




</body>
</html>
