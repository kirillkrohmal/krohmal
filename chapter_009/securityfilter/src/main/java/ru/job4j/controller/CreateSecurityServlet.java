package ru.job4j.controller;

import ru.job4j.cache.UserStorage;
import ru.job4j.model.User;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class CreateSecurityServlet extends HttpServlet {

    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/CreateSecurity.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserStorage.getInstance().add(new User(atomicInteger.incrementAndGet(), req.getParameter("login"), req.getParameter("password"), req.getParameter("role")));
        //doGet(req,resp);
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/loginsecurity"));
    }
}
