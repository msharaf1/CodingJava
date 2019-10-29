
<%@ page language="java" pageEncoding="UTF-8" session="false"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<!DOCTYPE html>
<html>
  <head>
    <title>CodePage</title>

  </head>
  
  <body>
  <h1 style="color:red"><c:out value="${error}" /></h1>
  <%-- <h1>You must try hard</h1> --%>
  <h2>What is the Code?</h2>
  <form action="/code/word" method="POST" >
        <p> <input type="text" name="passCode" placeholder="pass Code" /> </p>
        <p> <input type="submit" id="submit" value="Try Code"/> </p>
  </form>
  </body>
</html>