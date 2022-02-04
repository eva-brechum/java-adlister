
<%@ page contentType="text/html;charset=UTF-8" language ="java" %>

<%
    if(request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if(username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile");
        }
    }
%>
<html>
<head>
    <title>Login</title>
    <jsp:include page="partials/head.jsp">
     <jsp:param name ="title" value="Please Log In" />
   </jsp:include>
</head>
<body>

<jsp:include page="partials/navbar.jsp"/>

<h1>Enter your login info</h1>
<form method="POST" action="/login.jsp">
    <label for="username">Username</label>
    <input id="username" name="username" type="text">
    <br>
    <label for="password">Password</label>
    <input id="password" name="password" type="password">
    <br>
    <input type="submit">
</form>
</body>
</html>

