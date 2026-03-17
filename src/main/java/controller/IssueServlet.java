package controller;

import entity.Issue;
import service.IssueService;

import jakarta.servlet.*;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.text.SimpleDateFormat;

public class IssueServlet extends HttpServlet {

    protected void doPost(
            HttpServletRequest req,
            HttpServletResponse res)
            throws ServletException, IOException {

        try {

            int userId =
                    Integer.parseInt(
                            req.getParameter("userId"));

            int bookId =
                    Integer.parseInt(
                            req.getParameter("bookId"));

            String issueDate =
                    req.getParameter("issueDate");

            String returnDate =
                    req.getParameter("returnDate");


            SimpleDateFormat f =
                    new SimpleDateFormat("yyyy-MM-dd");


            Issue issue = new Issue();

            issue.setUser_id(userId);
            issue.setBook_id(bookId);

            issue.setIssue_date(
                    f.parse(issueDate));

            issue.setReturn_date(
                    f.parse(returnDate));


            IssueService service =
                    new IssueService();

            service.issue(issue);


            res.sendRedirect(
                    req.getContextPath()
                            + "/jsp/librarian.jsp");

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}