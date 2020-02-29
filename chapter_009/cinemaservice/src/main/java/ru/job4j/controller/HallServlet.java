package ru.job4j.controller;

import ru.job4j.model.Halls;
import ru.job4j.persistence.JdbcStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;


public class HallServlet extends HttpServlet {

    private final JdbcStore storage = JdbcStore.getInstance();
    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/index.html");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        storage.addHolls(new Halls(atomicInteger.incrementAndGet(), req.getParameter("rows"), req.getParameter("place")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/payment"));
    }
}