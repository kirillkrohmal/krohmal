package ru.job4j.CrudServlet;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.job4j.servlets.EchoServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.function.Function;
import java.util.logging.LogManager;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

/**
 * Created by Comp on 06.11.2017.
 */
public class UsersServlet extends HttpServlet {
    //private static final Logger LOGGER = LogManager.getLogger(EchoServlet.class);
    private final ValidateService logic = ValidateService.getInstance();
    private final Map<String, Function<HttpServletRequest, Boolean>> dispatch = new HashMap<>();
    private final String ls = System.lineSeparator();


    public UsersServlet() {
        dispatch.put("add", add());
        dispatch.put("update", update());
        dispatch.put("delete", delete());
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = new PrintWriter(resp.getOutputStream());
        List<User> users = logic.findAll();

        for (User user : users) {
            printWriter.append(String.format("Name = %s, Login = %s, e-mail = %s, id = %d, date = %s<br>",
                    user.getName(), user.getLogin(), user.getEmail(), user.getId(), user.getCreateDate())));
        }
        
        printWriter.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");

        doGet(req, resp);
    }


    public Function<HttpServletRequest, Boolean> add() {



        return null;
    }

    public Function<HttpServletRequest, Boolean> update() {

        return null;
    }

    public Function<HttpServletRequest, Boolean> delete() {

        return null;
    }



}
