<%--
  Created by IntelliJ IDEA.
  User: presleyblack
  Date: 8/29/23
  Time: 11:21 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Outcome</title>
</head>
<body>
    <c:choose>
        <c:when test="${userguess}">
            <p>You've guessed correctly! :)</p>
        </c:when>
        <c:otherwise>
            <p>I'm sorry you've guessed incorrect. :(</p>
        </c:otherwise>
    </c:choose>
</body>
</html>
