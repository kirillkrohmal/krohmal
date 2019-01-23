package ru.job4j.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 * Created by Comp on 06.11.2017.
 */
public class EchoServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(EchoServlet.class);


    private List<String> users = new CopyOnWriteArrayList<>();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<html>\n" +
                " <head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>Table</title>\n" +
                "<body>\n" +
                "<h2>User Input Form</h2>\n" +
                "<form method=\"get\" action=\"echo\">\n" +
                "  <fieldset>\n" +
                "    <legend>Your Name</legend>\n" +
                "    Name: <input type=\"text\" name=\"username\" /><br /><br />\n" +
                "</form>\n" +
                "</html>"
        );
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        UserStorage.getInstance().add(new User(req.getParameter("login"), req.getParameter("email")));
        resp.sendRedirect(String.format("%s/index.jsp", req.getContextPath()));
    }
}

