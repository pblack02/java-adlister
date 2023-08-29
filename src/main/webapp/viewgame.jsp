<%--
  Created by IntelliJ IDEA.
  User: presleyblack
  Date: 8/29/23
  Time: 11:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Guess Game</title>
</head>
<body>
<div class="text-align: center">
    <form method="POST" action="/viewgame">
        <label for="guess">
            <input type="text" placeholder="Pick a Number Between 1-3" id="guess" name="guess">
        </label>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</div>
</body>
</html>
