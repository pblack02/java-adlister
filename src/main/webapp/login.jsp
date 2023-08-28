<%--
  Created by IntelliJ IDEA.
  User: presleyblack
  Date: 8/23/23
  Time: 12:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%! String username; %>
<%! String password; %>
<html>
<head>
    <title>Title</title>
</head>
<body>
   <div class="container">
       <%@include file="partials/navbar.jsp"%>
       <div style="text-align: center">
           <h1>Welcome please login</h1>
           <div style="text-align: center">
               <form action="${pageContext.request.contextPath}/login.jsp" method="POST">
                   <label for="username">Username</label>
                   <input type="text" id="username" name="username" size="30">
                   <br>
                   <label type="password" for="password">Password</label>
                   <input id="password" type="password" name="password" size="30">
                   <br>
                   <button type="submit">Login</button>
               </form>
           </div>
       </div>
   </div>
    <c:if test="${param.username.equals('admin') && param.password.equals('password')}">
        <%response.sendRedirect("/profile.jsp");%>
    </c:if>
</body>
</html>



