    <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%--  <c:out value="${//j}"/>  --%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Main Page</title>

<style>
            .content {
                margin: auto;
        }
        table, th, td {
        border: 1px solid black;
        }
</style>


</head>
<body>
        <div class="content">
        <h1><span style="color:navy">Submitted Information!</span></h1>
        <table style="width:100%">
            <tr>
                <th>Name: </th>
                <th>Dojo Locations: </th>
                <th>Program Names: </th>
            </tr>
            <tr>
                <td><c:out value="${fullName}" /> </td>
                <td><c:out value="${dojoLocations}" /> </td>
                <td><c:out value="${progList}" /> </td>
            </tr>
        </table>
        </div>
        </div>

</body>
</html>