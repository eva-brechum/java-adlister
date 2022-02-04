<%--
  Created by IntelliJ IDEA.
  User: evabrechum
  Date: 2/4/22
  Time: 2:32 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
<form method="POST" action="/pizza-order.jsp">

    <%--@declare id="crust"--%><label for="crust">Crust</label>
    <input type="text" name="crust" type="text">

    <br>

    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>

    <input type="submit">
</form>
</body>
</html>
