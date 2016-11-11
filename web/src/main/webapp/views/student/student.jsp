<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: innopolis
  Date: 31.10.16
  Time: 23:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student</title>
</head>
<body>
    Фамилия: <input>${student.lastName}<br>
    Имя: ${student.name}<br>
    Пол: ${student.sex}<br>
    Год рождения: ${student.dateBirth}
<br>
<hr>
<a href="/student/list">Назад к списку</a>
</body>
</html>
