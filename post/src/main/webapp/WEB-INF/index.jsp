<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-04-24
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
    <title>Title</title>
</head>
<body>


<h1>All Posts</h1>
<table>
    <thead>
    <tr>
        <th>Post</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${posts}" var="post">
        <tr>
            <td><c:out value="${post.postName}"/></td>
        </tr>
    </c:forEach>

    </tbody>
</table>
<a href="/posts/new">New Post</a>

</body>
</html>
