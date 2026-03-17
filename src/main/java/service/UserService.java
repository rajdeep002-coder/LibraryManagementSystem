package service;

import dao.UserDAO;
import entity.User;

public class UserService {

    UserDAO dao = new UserDAO();

    public User login(String u, String p) {

        return dao.login(u, p);
    }
}