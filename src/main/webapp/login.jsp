<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language ="java" %>
<html>
<head>
    <title>Login</title>
<%@include file="partials/"%>    
</head>
<body>
<%--<form method="POST" action="login.jsp">--%>
<%--    <h1>Enter your login info</h1>--%>
<%--    <label for="username">Username</label>--%>
<%--    <input id="username" name="username" type="text">--%>
<%--    <br>--%>

<%--    <label for="password">Password</label>--%>
<%--    <input id="password" name="password" type="password">--%>
<%--    <br>--%>
<%--    <input type="submit">--%>
<%--</form>--%>
<c:choose>
    <c:when test="${param.username == 'admin' && param.password == 'password'}"/>
        <c:redirect url = "/profile.jsp"/>
</c:choose>

</body>
</html>

