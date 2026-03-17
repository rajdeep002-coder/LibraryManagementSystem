package controller;

import entity.Book;
import service.BookService;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;

public class BookServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        try {

            String title =
                    req.getParameter("title");

            String author =
                    req.getParameter("author");

            String isbn =
                    req.getParameter("isbn");

            int quantity =
                    Integer.parseInt(
                            req.getParameter("quantity"));

            Book book = new Book();

            book.setTitle(title);
            book.setAuthor(author);
            book.setIsbn(isbn);
            book.setQuantity(quantity);

            BookService service =
                    new BookService();

            service.addBook(book);

            res.sendRedirect(
                    req.getContextPath()
                            + "/jsp/admin.jsp");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}