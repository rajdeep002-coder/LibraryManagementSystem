<%@ page import="java.util.*" %>
<%@ page import="service.BookService" %>
<%@ page import="entity.Book" %>

<html>
<head>

<title>View Books</title>

<link
href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css"
rel="stylesheet">

</head>

<body>

<div class="container">

<h2>Books List</h2>

<table class="table table-bordered">

<tr>
<th>ID</th>
<th>Title</th>
<th>Author</th>
<th>ISBN</th>
<th>Qty</th>
</tr>

<%
BookService service = new BookService();

List<Book> list = service.getBooks();

for(Book b : list){
%>

<tr>

<td><%= b.getId() %></td>
<td><%= b.getTitle() %></td>
<td><%= b.getAuthor() %></td>
<td><%= b.getIsbn() %></td>
<td><%= b.getQuantity() %></td>

</tr>

<%
}
%>

</table>

</div>

</body>
</html>