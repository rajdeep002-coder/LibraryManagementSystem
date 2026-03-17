package controller;

import service.UserService;
import entity.User;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        String u = req.getParameter("username");
        String p = req.getParameter("password");

        UserService service = new UserService();

        User user = service.login(u, p);

        if (user != null) {

            if (user.getRole().equals("ADMIN")) {

                res.sendRedirect(
                        req.getContextPath()
                                + "/jsp/admin.jsp");

            } else if (user.getRole().equals("LIBRARIAN")) {

                res.sendRedirect(
                        req.getContextPath()
                                + "/jsp/librarian.jsp");

            } else {

                res.sendRedirect(
                        req.getContextPath()
                                + "/jsp/student.jsp");
            }

        } else {

            res.sendRedirect(
                    req.getContextPath()
                            + "/jsp/login.jsp");
        }
    }
}