<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: evabrechum
  Date: 2/7/22
  Time: 3:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Ads</title>
</head>
<body>
    <c:forEach var ="ad" items="${ads}">
        <div class = "ad">
            <h1>${ad.title}</h1>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</body>
</html>
