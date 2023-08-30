<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
<h1>The Ads.</h1>
<c:forEach var="ad" items="${ads}">
    <div>
        <h2>${ad.title}</h2>
        <p>${ad.description}</p>
    </div>
</c:forEach>
</body>
</html>
