<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>User Answer</title>
</head>
<body>
<c:choose>
    <c:when test = "${answer}">
        <h1>You Guessed It!!</h1>
    </c:when>
    <c:otherwise>
        <h1> Wrong Guess</h1>
    </c:otherwise>
</c:choose>
</body>
</html>
