<%--
  Created by IntelliJ IDEA.
  User: innopolis
  Date: 02.11.16
  Time: 11:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <form action="/j_spring_security_check" method="post">
        Login: <input type="text" name="j_username"><br>
        Password: <input type="password" name="j_password"><br>
        <button type="submit">Login</button>
    </form>
</body>
</html>
