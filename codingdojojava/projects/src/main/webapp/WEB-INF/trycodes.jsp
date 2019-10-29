
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
    <c:forEach items="${words}" var="word"> 
      <li>
        <c:out value="${word}" />      
      </li>
      </c:forEach>

  </body>
</html>