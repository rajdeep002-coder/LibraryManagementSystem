<%@ page language="java" %>

<html>

<head>

    <title>Issue Book</title>

    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
    rel="stylesheet">

</head>

<body>

<div class="container">

    <h2>Issue Book</h2>

    <form action="../issue" method="post">

        User ID

        <input type="text"
               name="userId"
               class="form-control"/>

        Book ID

        <input type="text"
               name="bookId"
               class="form-control"/>

        Issue Date

        <input type="date"
               name="issueDate"
               class="form-control"/>

        Return Date

        <input type="date"
               name="returnDate"
               class="form-control"/>

        <br>

        <button class="btn btn-success">
            Issue Book
        </button>

    </form>

</div>

</body>

</html>