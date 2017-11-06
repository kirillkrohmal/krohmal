package ru.job4j.CrudServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by Comp on 06.11.2017.
 */
public class UsersServlet {
    private static final Logger log = LoggerFactory.getLogger(UsersServlet.class);


    private List<String> user = new CopyOnWriteArrayList<>();

    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        String login = req.getParameter("login");
        PrintWriter printWriter = new PrintWriter(resp.getOutputStream());
        printWriter.append("Hello World " + login);
        printWriter.flush();
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        this.user.add(req.getParameter("login"));
        doGet(req, resp);
    }
}
