package ru.job4j.CrudServlet;


import ru.job4j.servlets.*;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Created by Comp on 06.11.2017.
 */
public class UserCreateServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        final ru.job4j.servlets.User user = new ru.job4j.servlets.User(req.getParameter("login"), req.getParameter("email"));
        System.out.println(user);
        UserStorage.getInstance().add(user);
        resp.sendRedirect(String.format("%s/index.jsp", req.getContextPath()));
    }
}






