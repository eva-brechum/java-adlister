<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language ="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>
<form method="POST">

    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>
<c:choose>
    <c:when test="${param.username == 'admin' && param.password == 'password'}"/>
</c:choose>

</body>
</html>

