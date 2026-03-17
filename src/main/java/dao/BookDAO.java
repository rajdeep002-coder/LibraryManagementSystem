package dao;

import entity.Book;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.HibernateUtil;

import java.util.List;

public class BookDAO {

    public void saveBook(Book book) {

        Session session =
                HibernateUtil
                        .getFactory()
                        .openSession();

        Transaction tx =
                session.beginTransaction();

        session.persist(book);

        tx.commit();

        session.close();
    }


    public List<Book> getAllBooks() {

        Session session =
                HibernateUtil
                        .getFactory()
                        .openSession();

        List<Book> list =
                session.createQuery(
                        "FROM Book",
                        Book.class
                ).list();

        session.close();

        return list;
    }
}