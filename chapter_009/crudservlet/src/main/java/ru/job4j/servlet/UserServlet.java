package ru.job4j.servlet;


import ru.job4j.validate.ValidateService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by Comp on 06.11.2017.
 */
public class UserServlet extends HttpServlet {
    private final ValidateService logic = ValidateService.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");


        //req.setAttribute("users", new User(req.getParameter("name"), req.getParameter("login"), req.getParameter("email"), req.getParameter()));
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/ViewUsers.jsp");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        PrintWriter printWriter = new PrintWriter(resp.getOutputStream());
        printWriter.append(makeAction(req) ? "Action done" : "Action error");

        printWriter.flush();
    }

    private boolean makeAction(HttpServletRequest req) {

        return false;
    }
}






