package ru.job4j.UsersServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Comp on 23.09.2018.
 */
public class UsersServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = new PrintWriter(resp.getOutputStream());
        //printWriter.append(<>)


        printWriter.flush();

    }
}
