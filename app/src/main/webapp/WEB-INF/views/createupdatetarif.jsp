<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
</head>
<body style="background-color: burlywood">

<form action="createupdate" method="post">
    <p>Изменение выбранного тарифа</p>
    <p>Имя</p>
    <p><input type="text" name="name" placeholder=${name} required></p>
    <p>Цена</p>
    <p><input type="number" name="price" placeholder=${price}></p>
    <p>Тип</p>
    <p><input type="text" name="type" placeholder=${type}></p>
    <p>Описание</p>
    <p><input type="text" name="context" placeholder=${context}></p>

    <p><input type="submit" name="button1" value="submit" /></p>
</form>

<p><a href=/adminoffice> Вернуться</a></p>
</body>
</html>