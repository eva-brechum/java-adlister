<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><%= "some title" %></title>
</head>
<body>
    <c:if test="true">
        <h1>Welcome to your profile</h1>
    </c:if>
    <c:if test="false">
        <h1>Try again</h1>
    </c:if>
</body>
</html>
