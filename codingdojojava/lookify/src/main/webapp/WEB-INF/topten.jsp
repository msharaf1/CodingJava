<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lookify</title>
<link href="/css/stylesheet.css" rel="stylesheet">

</head>
<body>
    <div class="mainContainer">
        <%-- <p>Welcome to Lookify Dashboard!</p> --%>
        <div class="banner">
            <div class="barLinks">  <div class="bLinks"><a href="/songs/new"> Add New </a></div>
                <div class="bLinks"><a href="#">Top Songs</a> ||  
                <a href="/dashboard">Dashboard</a>
                </div>
            </div>
            <%-- <div class="miniForm">
                <div class="inputField"> <input type="text" name="searchName" /></div>
                <div class="button"> <input type="submit" name="searchName" value="Search Artists" /> </div>
            </div> --%>
        </div>
        <div class="viewForm">
        <%-- <p> <c:out value="${artists}" /> </p> --%>
            <table>
            <tr>
                <th>Top Ten Songs: </th>
                
            </tr>
            <tbody>
            <c:forEach items="${tenArtist}" var="artist">
                <tr>
                    <td> <c:out value="${artist.rating}" /> -  <c:out value="${artist.title}" /> - <c:out value="${artist.artistName}" /> </td>
                    <%-- <td> <c:out value="${artist.id}"/> <td> --%>
                </tr>
                <%-- <tr>
                    <td> </td>
                </tr>
                <tr>
                    <td> </td>
                </tr> --%>
                </c:forEach>
            </tbody>
        </div>

    </div>


</body>
</html>