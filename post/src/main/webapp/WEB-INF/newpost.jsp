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
<html>
<head>
    <title>Add a new Post</title>
</head>
<body>


<h1>New Post</h1>
<p><form:errors path="postObj.*"/></p>
<form:form action="/posts/new" method="POST" modelAttribute="postObj">
    <p>
        <form:label path="postName">Write Your Post: </form:label>
<%--        <form:errors path="postName"></form:errors>--%>
        <form:input path="postName"/>
    </p>


    <input type="submit" value="Submit"/>
</form:form>




</body>
</html>
