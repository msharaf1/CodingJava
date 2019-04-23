<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-04-22
  Time: 08:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
</head>
<body>
    <h1>Welcome PC</h1>
<div class="container">
    <div class="subContainer">
        <p> <c:out value="${product.name}"></c:out>
</p>

        
    </div>

</div>

</body>
</html>
