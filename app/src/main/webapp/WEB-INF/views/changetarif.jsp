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
        <a href="#" class="navbar-brand">Выберите новый тариф</a>
    </div>
    </div>
</nav>

<p>
<Table border=2>
    <thread>
    <tr>
        <td>Доступные тарифы</td>
    </tr>
        <c:forEach var="tarif" items="${list}">

        <tr>
            <td><a href=/changetarifimpl?login=${login}&password=${password}&id=${tarif.id}>${tarif.tarifName}</a></td>
        </tr>
        </c:forEach>

</p>
<div class="container">


    <p><a href=/office?login=${login}&password=${password}> Вернуться</a></p>

</div>
</body>
</html>
