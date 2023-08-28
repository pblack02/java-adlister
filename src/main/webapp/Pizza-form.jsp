<%--
  Created by IntelliJ IDEA.
  User: presleyblack
  Date: 8/28/23
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizzaaaa</title>
</head>
<body>
<h1>Create a Pizza</h1>
<form action="/pizza-order" method="POST">
    <div class="form-group">
        <label for="crust">Crust</label>
        <input id="crust" name="crust" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="sauce">Sauce</label>
        <input id="sauce" name="sauce" class="form-control" type="text">
    </div>
    <div class="form-group">
        <label for="size">Size</label>
        <input id="size" name="size" class="form-control" type="text">
    </div>
    <div class="form-group" id="toppings">
        <h1>Toppings</h1>
        <label for="pepperoni">Pepperoni</label>
        <input type="checkbox" for="pepperoni" id="pepperoni" name="pepperoni">
        <label for="sausage">Sausage</label>
        <input type="checkbox" for="sausage" id="sausage" name="sausage">
        <label for="ham">Ham</label>
        <input type="checkbox" for="ham" id="ham" name="ham">
    </div>
    <div class="form-group">
        <label for="address">Please enter your address!</label>
        <input type="text" name="address" id="address">
    </div>
    <input type="submit" class="btn btn-primary btn-block" value="Submit">
</form>
</body>
</html>
