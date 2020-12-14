<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Dell
  Date: 29.10.2019
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body style="background-color: burlywood">

<p>Добро пожаловать, ${name} ${sname} </p>

<p>Информация об аккаунте</p>
<p>Текущий Тариф:  ${tarif}</p>
<p><a href=/changetarif?login=${login}&password=${password}>Изменить</a></p>
<p>Баланс Аккаунта: ${balance}</p>
<p><a href=/balance?login=${login}&password=${password}>Изменить</a></p>
<p>Пароль:  ${password} </p>

<p>Для активации вашего тарифного плана позвоните по номеру +375445416609</p>

<p><a href=/> Вернуться</a></p>
</body>
</html>
