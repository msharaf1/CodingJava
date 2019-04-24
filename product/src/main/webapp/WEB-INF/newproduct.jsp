<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: menhaj
  Date: 2019-04-23
  Time: 07:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add a new product</title>
</head>
<body>
    <h1>Add a new product!</h1>
    <p> Errors: <form:errors path="productObj.*"/> </p>
    <div class="container">
        <form:form action="/product" method="POST" modelAttribute="productObj">
            <table>
                <tr>
                    <td> <form:label path="name">Name</form:label> </td>
                    <%--<td> <form:errors path="name"/> </td>--%>
                    <td> <form:input path="name"/> </td>

                </tr>
                <tr>
                    <td><form:label path="desc">Description</form:label></td>
                    <%--<td> <form:errors path="desc"/> </td>--%>
                    <td><form:input path="desc"/></td>
                </tr>


                <%--<tr>--%>
                    <%--<td><form:label path="price">Price</form:label></td>--%>
                    <%--<td><form:input path="price"/></td>--%>
                <%--</tr>--%>

                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
    </div>

</body>
</html>
