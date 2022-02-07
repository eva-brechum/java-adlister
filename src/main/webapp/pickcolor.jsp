<%--
  Created by IntelliJ IDEA.
  User: evabrechum
  Date: 2/4/22
  Time: 4:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pick Color</title>
</head>
<body>
<form method="POST" action="/pickcolor.jsp">
   <label for="color">Color:</label>
    <input type ="text" id="color" name="color">
    <input type ="submit" value="Submit">
</form>
</body>
</html>
