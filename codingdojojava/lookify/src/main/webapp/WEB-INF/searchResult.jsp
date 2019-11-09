<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify</title>
<link href="/css/stylesheet.css" rel="lightgray">
</head>
<body>
    <div clas="mainContainer">
        <p>Welcome to Lookify!</p>
        <a href="/dashboard">Dashboard</a>

        <div class="viewForm">
            <table>
            <tr>
                <th>Title</th>
                <th>Artist</th>
                <th>Rating</th>
                <th>actions</th>
            </tr>
            <tbody>
            <c:forEach items="${artistsByName}" var="artist">
                <tr>
                    <td> <c:out value="${artist.title}" /> </td>
                    <td> <c:out value="${artist.artistName}" /> </td>
                    <td> <c:out value="${artist.rating}" /> </td>
                    <td> <c:out value="${artist.id}"/> <td>
                </tr>
                </c:forEach>
            </tbody>
        </div>
    </div>


</body>
</html>