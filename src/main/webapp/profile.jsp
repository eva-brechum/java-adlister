<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <jsp:include page="/partials/head.jsp">
        <jsp:param name="title" value="Your Profile" />
    </jsp:include>
</head>

<body>
<c:if test="${user}">

</c:if>
    <jsp:include page="/partials/navbar.jsp" />
    <h1>Welcome "${user}"</h1>
    <div class="container">
        <h1>Viewing your profile.</h1>
    </div>

</body>
</html>
