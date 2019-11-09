<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
                <div class="bLinks"><a href="dashboard/topten">Top Songs</a> </div>
            <div class="miniForm">
            <form method="post" action="/dashboard/search">
                <h2> Songs by Artist:</h2>
                <input type="text" name="artistName" placeholder="Arist Name"/>
                <input type="submit" value="New Search"/>
                <%-- <h2> Songs by Artist: <c:out value="${artistsByName.get(0).getArtistName()}"/></h2>
                <input type="text" name="getArtistName" placeholder="${artistsByName.get(0).getArtistName()}"></input>
                <input type="submit" value="New Search"></input> --%>
            </form>
            <br><br><br>
            <div>
        </div>

        <div class="viewForm">
            <table>
            <tr>
                <th>Title</th>
                <th>Artist</th>
                <th>Rating</th>
                <th>actions</th>
            </tr>
            <tbody>
            <c:forEach items="${artistList}" var="artist">
                <tr>
                    <td> <c:out value="${artist.title}" /> </td>
                    <td> <c:out value="${artist.artistName}" /> </td>
                    <td> <c:out value="${artist.rating}" /> </td>
                    <%-- <td> <c:out value="${artist.id}"/> <td> --%>
                    <td> <a href="/dashboard/delete/${artist.id}">Delete</a></td>
                </tr>

                </c:forEach>
            </tbody>
        </div>

    </div>


</body>
</html>