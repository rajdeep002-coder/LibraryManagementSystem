package dao;

import entity.Issue;
import org.hibernate.Session;
import util.HibernateUtil;

public class IssueDAO {

    public void issueBook(Issue issue) {

        Session s =
                HibernateUtil.getFactory().openSession();

        s.beginTransaction();

        s.save(issue);

        s.getTransaction().commit();

        s.close();
    }
}