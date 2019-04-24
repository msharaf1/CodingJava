<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-04-24
  Time: 08:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add your posts</title>
</head>
<body>
    <div class="subContainer1">
        <p> Posted: <c:out value="${post.postName}" /> </p>
        <p> <form:errors path="post.*"/> </p>
    </div>
    <form:form action="/posts/new" method="post" modelAttribute="posts">
        <p>
            <form:label path="postName"/>
            <form:input path="postName"/>
        </p>
        <p> <input type="submit" value="Submit"/> </p>

    </form:form>

    <div class="subContainer2">

    </div>

</body>
</html>
