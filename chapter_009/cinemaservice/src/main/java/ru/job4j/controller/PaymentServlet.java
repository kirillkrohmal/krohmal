package ru.job4j.controller;

import ru.job4j.model.Accounts;
import ru.job4j.model.Halls;
import ru.job4j.persistence.JdbcStore;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;


public class PaymentServlet extends HttpServlet {
    private final JdbcStore storage = JdbcStore.getInstance();
    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/payment.html");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        storage.addAccounts(new Accounts(atomicInteger.incrementAndGet(), req.getParameter("username"), req.getParameter("phone")));
        resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/view"));

    }
}