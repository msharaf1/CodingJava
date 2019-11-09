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
<link href="/css/stylesheet.css" rel="lightgray">

</head>
<body>
    <div clas="mainContainer">
     <div class="barLinks"> <a href="/dashboard"> Dashboard </a></div>
        
        <%-- <div class="subFrom">
                <form action="/songs/new" method="post" modelAttribute="artistObj">
                <input type="text" name="title"/>
                <input type="text" name="artistName"/>
                <input type="number" name="rating"/>

                <br/>
                <input type="submit" value="Add Artist"/>

                </form>
        </div> --%>


        <div class="subFrom">
                <form:form action="/songs/new" method="post" modelAttribute="artistObj">
                    <form:label path="title">Songs: </form:label>
                    <form:errors path="title" />
                    <form:input path="title" type="text" name="title" />

                    <form:label path="artistName">Artist: </form:label>
                    <form:errors path="artistName" />
                    <form:input path="artistName" type="text" name="artistName"/>

                    <form:label path="rating">Rating: </form:label>
                    <form:errors path="rating" />
                    <form:input path="rating" type="number" name="rating"/>

                <br/>
                <input type="submit" value="Add Artist"/>

                </form:form>
        </div>
  
    </div>


</body>
</html>