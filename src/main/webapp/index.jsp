<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
<form method="POST">
    <h1>Enter your login Info</h1>
    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>
    <button type="submit">Login</button>
</form>

    <c:if test="true">
        <h1>Welcome to your profile</h1>
    </c:if>
    <c:if test="false">
        <h1>Try again</h1>
    </c:if>
</body>
</html>
