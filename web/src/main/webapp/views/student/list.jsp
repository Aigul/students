<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: innopolis
  Date: 31.10.16
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Список студентов</title>
    <style type="text/css">
        table {
            width: 300px;
            border-collapse: collapse;
        }
        td, th {
            padding: 3px;
            border: 1px solid black;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th>Фамилия</th>
            <th>Имя</th>
            <th>пол</th>
            <th>Год рождения</th>
        </tr>
        <c:forEach var="student" items="${list}">
            <tr>
                <td>
                    <a href="/student/student=${student.id}">${student.lastName}</a>
                </td>
                <td>
                    <a href="/student/student=${student.id}">${student.name}</a>
                </td>
                <td>${student.sex}</td>
                <td>${student.dateBirth}</td>
                <td><a href="#">Изменить</a></td>
                <td><a href="#">Удалить</a></td>
            </tr>
        </c:forEach>
    </table>
    <br>
    <br>
    <br>
    <br>
    <form action="add" method="post" name="student">
        Фамилия: <input type="text" name="lastName"><br>
        Имя: <input type="text" name="name"><br>
        Пол: <input name="sex" type="radio" value="male"> Муж.
        <input name="sex" type="radio" value="female"> Жен.
        <br>
        Год рождения: <input type="date" name="dateBirth"><br>
        <button type="submit">Добавить</button>
    </form>
</body>
</html>
