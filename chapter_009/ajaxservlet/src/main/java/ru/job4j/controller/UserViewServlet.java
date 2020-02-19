package ru.job4j.controller;

import ru.job4j.model.User;
import ru.job4j.persistence.UserStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class UserViewServlet extends HttpServlet {
    private AtomicInteger atomicInteger = new AtomicInteger();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("views/index.html");
        requestDispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      /*  resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        User user = new User(atomicInteger.incrementAndGet(), req.getParameter("name"), req.getParameter("lastName"), req.getParameter("sex"), req.getParameter("description"));
        UserStorage.getInstance().add(user);
        writer.append(mapper.writeValueAsString(user));
        writer.flush();*/


        resp.setContentType("text/html");
        UserStorage.getInstance().add(new User(atomicInteger.incrementAndGet(), req.getParameter("name"), req.getParameter("lastName"), req.getParameter("sex"), req.getParameter("description")));
        doGet(req, resp);
    }
}