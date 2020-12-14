<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <title>Hello page</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body style="background-color: burlywood">
<p></p>

Текущие активные тарифы:

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
            <td><a href=/createupdate?id=${tarif.id}> Изменить</a></td>
            <td><a href=/delete?id=${tarif.id}> Удалить</a></td>
        </tr>
        </c:forEach>

</p>
<div class="container">

    <a href=/createupdate?id=0> Добавить новый тариф</a>
    <p><a href=/> Вернуться</a></p>

</div>
</body>
</html>