package service;

import dao.BookDAO;
import entity.Book;

import java.util.List;

public class BookService {

    BookDAO dao = new BookDAO();

    public void addBook(Book b) {

        dao.saveBook(b);
    }

    public List<Book> getBooks() {

        return dao.getAllBooks();
    }
}