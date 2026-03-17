package dao;

import entity.User;
import org.hibernate.Session;
import util.HibernateUtil;

public class UserDAO {

    public User login(String username, String password) {

        Session session =
                HibernateUtil.getFactory().openSession();

        User user = null;

        try {

            user = session.createQuery(
                            "from User where username=:u and password=:p",
                            User.class)
                    .setParameter("u", username)
                    .setParameter("p", password)
                    .uniqueResult();

        } finally {

            session.close();
        }

        return user;
    }
}