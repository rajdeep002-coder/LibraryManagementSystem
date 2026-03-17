package service;

import dao.IssueDAO;
import entity.Issue;

public class IssueService {

    IssueDAO dao = new IssueDAO();

    public void issue(Issue i) {

        dao.issueBook(i);
    }
}