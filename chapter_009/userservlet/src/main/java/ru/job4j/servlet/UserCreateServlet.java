package ru.job4j.servlet;

import ru.job4j.cache.UserStorage;
import ru.job4j.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by Comp on 01.11.2018.
 */

public class UserCreateServlet extends HttpServlet {
    private final UserStorage cache = UserStorage.getInstance();
    private AtomicInteger atomicInteger = new AtomicInteger();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/CreateUser.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*int id = 1;

        User user = new User(id, login, password);
        UserStorage stor = UserStorage.getInstance();
        stor.add(user);

        String login = "login";
        String password = "email";

        req.setAttribute("userLogin", login);
        doGet(req, resp);*/


        cache.add(new User(atomicInteger.incrementAndGet(), req.getParameter("login"), req.getParameter("email")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/list"));
    }
}
