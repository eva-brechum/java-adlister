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
    <select class="form-select" aria-label="Default select example">
        <option selected>Menu</option>
        <option value="1">Crust Type</option>
        <option value="2">Sauce</option>
        <option value="3">Size</option>
    </select>
    <input id = "name" name>
    <inout type = "phone num" name="phone number"/>
    <input type="submit">
</form>
</body>
</html>
