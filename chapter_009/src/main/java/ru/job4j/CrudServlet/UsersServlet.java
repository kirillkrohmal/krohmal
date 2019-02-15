package ru.job4j.CrudServlet;


import ru.job4j.servlets.EchoServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * Created by Comp on 06.11.2017.
 */
public class UsersServlet extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");



    }
}






