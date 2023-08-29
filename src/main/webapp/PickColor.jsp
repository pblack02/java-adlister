<%--
  Created by IntelliJ IDEA.
  User: presleyblack
  Date: 8/28/23
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<h1>Whats your fav color!</h1>
<div class="text-align: center">
    <form method="POST" action="${pageContext.request.contextPath}/PickColor">
        <label for="color">
         <input type="text" placeholder="Pick a color" id="color" name="color">
     </label>
        <input type="submit" class="btn btn-primary btn-block" value="Submit">
    </form>
</div>
</body>
</html>
