<%@ page language="java" %>

<html>

<head>

    <title>Login</title>

    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
    rel="stylesheet">

</head>

<body>

<div class="container">

    <h2>Library Login</h2>

    <form action="../login" method="post">

        Username

        <input type="text"
               name="username"
               class="form-control"/>

        Password

        <input type="password"
               name="password"
               class="form-control"/>

        <br>

        <button class="btn btn-primary">
            Login
        </button>

    </form>

</div>

</body>

</html>