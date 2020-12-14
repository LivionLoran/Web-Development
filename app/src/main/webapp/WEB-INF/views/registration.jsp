<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body style="background-color: burlywood">

<p>Регистрация</p>

<form action="registr" method="post">
    <p>Заполните данные нового пользователя</p>
    <p>Имя</p>
    <p><input type="text" name="name"  required></p>
    <p>Фамилия</p>
    <p><input type="text" name="sname"  required></p>
    <p>Почтовый адрес (логин)</p>
    <p><input type="text" name="login"  required></p>
    <p>Пароль</p>
    <p><input type="text" name="password" required></p>
    <p>Тариф(временно)</p>
    <p><input type="text" name="tarif" required></p>
    <p><input type="submit" name="button1" value="submit" /></p>
</form>

<p><a href=/> Вернуться</a></p>

</body>
</html>
