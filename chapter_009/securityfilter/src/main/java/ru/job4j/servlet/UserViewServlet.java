package ru.job4j.servlet;

import ru.job4j.cache.UserStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UserViewServlet extends HttpServlet {
    UserStorage cache = UserStorage.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("users", cache.getUsers());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/UserView.jsp");
        dispatcher.forward(req, resp);
    }
}
