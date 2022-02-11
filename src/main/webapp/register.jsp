<%--
  Created by IntelliJ IDEA.
  User: evabrechum
  Date: 2/10/22
  Time: 4:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Registration Form</title>
</head>
<body>
    <h1>Create User Registration</h1>
    <form method="POST" action="/register.jsp">

        <label for="username">UserName</label>
        <input type=" text" name="username" id="username">
        <br>
        <label for="email">Email</label>
        <input type=" text" name="email" id="email">
        <br>
        <label for="password">Password</label>
        <input type=" text" name="password" id="password">
        <br>
        <input type="submit" value="Submit" />
    </form>
</body>
</html>
