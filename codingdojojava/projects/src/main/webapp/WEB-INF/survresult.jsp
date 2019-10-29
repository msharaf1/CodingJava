
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <title>CodePage</title>

  </head>  
  <body>
  <h1>Result</h1>

    <%-- <h3>Name: <c:out value="${name}"/></h3> --%>
    <%-- <p>Language: <c:out value="${lang}" /> </p>
    <p>Location: <c:out value="${loc}" /> </p>
    <p>Comments: <c:out value="${com}" /> </p> --%>

  <h2>What you entered: </h2>
	<h3>Name: <c:out value="${sname}"/></h3>
        <p>Language: <c:out value="${slang}" /> </p>

	<h3>Location: <c:out value="${sloc}"/></h3>
	<h3>Favorite Language: <c:out value="${slang}"/></h3>
	<h3>Comment: <c:out value="${scom}"/></h3>

  </body>
</html>