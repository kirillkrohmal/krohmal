package ru.job4j.controller;

import ru.job4j.cache.UserStorage;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginSecurityServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher dispatcher = req.getRequestDispatcher("/views/LoginSecurity.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = "login";
        String password = "password";

        if(UserStorage.getInstance().isLogin(login, password)) {
            HttpSession httpSession =  req.getSession();

            synchronized (httpSession) {
                httpSession.setAttribute("login", login);
                httpSession.setAttribute("password", password);
            }
            resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/userview"));
        } else {
            req.setAttribute("error", "Invalid Login");
            doGet(req, resp);
        }
    }
}
