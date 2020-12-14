<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Hello page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body style="background-color:mediumaquamarine">

<style>
    body { background-image: url("1.jpg")}
</style>

<p></p>
<nav class="navbar navbar-default">
    <div class="container-fluid">
    <div class="navbar-header">
        <a href="#" class="navbar-brand">Приветствуем вас на сайте интернет-провайдера VolkNet</a>
    </div>
    </div>
</nav>

<p>Снизу указан список наших тарифных планов. Зарегестривовавшись, вы сможете пользоваться вашим личным кабинетом.</p>
<p>Активация выбранного вами тарифного плана происходит из вашего личного кабинета</p>
<p>
<Table border=2>
    <thread>
    <tr>
        <td>Тариф</td>
        <td>Цена в месяц/год</td>
        <td>Предоставляемые Услуги</td>
        <td>Описание</td>
    </tr>
        <c:forEach var="tarif" items="${list}">

        <tr>
            <td>${tarif.tarifName}</td>
            <td>${tarif.tarifPrice}</td>
            <td>${tarif.tarifType}</td>
            <td>${tarif.tarifContext}</td>
        </tr>
        </c:forEach>

</p>
<div class="container">


    <p><a href=/author> Вход </a></p>
    <p><a href=/registr> Регистрация </a></p>
    <p><a href=/adminauthor> Вы администратор? </a></p>

</div>
</body>
</html>
