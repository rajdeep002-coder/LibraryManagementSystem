<%@ page language="java" %>

<html>
<head>

    <title>Add Book</title>

    <link
    href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
    rel="stylesheet">

</head>

<body>

<div class="container">

    <h2>Add Book</h2>

    <form action="book" method="post">

        Title
        <input type="text"
               name="title"
               class="form-control"/>

        Author
        <input type="text"
               name="author"
               class="form-control"/>

        ISBN
        <input type="text"
               name="isbn"
               class="form-control"/>

        Quantity
        <input type="text"
               name="quantity"
               class="form-control"/>

        <br>

        <button class="btn btn-success">
            Add Book
        </button>

    </form>

</div>

</body>
</html>