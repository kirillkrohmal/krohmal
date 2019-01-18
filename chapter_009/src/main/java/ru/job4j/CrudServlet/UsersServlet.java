package ru.job4j.CrudServlet;


import ru.job4j.servlets.EchoServlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


/**
 * Created by Comp on 06.11.2017.
 */
public class UsersServlet extends HttpServlet {
    private static final Logger LOGGER = LogManager.getLogger(EchoServlet.class);
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
            printWriter.append(String.format("Name = %s, Login = %s, e-mail = %s, id = %d, date = %s<br>",user.getName(), user.getLogin(), user.getEmail(), user.getId(), user.getCreateDate()));

        }

        printWriter.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter printWriter = new PrintWriter(resp.getOutputStream());
        printWriter.append(makeAction(req) ? "Action done" : "Action error");
        printWriter.flush();

    }

    private boolean makeAction(HttpServletRequest req) {
        Function<HttpServletRequest, Boolean> func = dispatch.get(req.getParameter("action"));
        return func != null ? func.apply(req) : false;
    }


    public Function<HttpServletRequest, Boolean> add() {
        /*return param -> {
            String name = param.getParameter("name");
            String login = param.getParameter("login");
            String email = param.getParameter("email");
            //return logic.add(name, login, email);
        };*/
        return null;
    }

    public Function<HttpServletRequest, Boolean> update() {
        return param -> {
            boolean result = false;
            int id = -1;
            try {
                id = Integer.parseInt(param.getParameter("id"));
                String name = param.getParameter("name");
                String login = param.getParameter("login");
                String email = param.getParameter("email");
                //result = logic.update(id, name, login, email);
            } catch (NumberFormatException nfe) {
                LOGGER.error(nfe.getMessage(), nfe);
            }
            return result;
        };
    }

        public Function<HttpServletRequest, Boolean> delete () {
            return param -> {
                boolean result = false;
                int id = -1;
                try {
                    id = Integer.parseInt(param.getParameter("id"));
                    result = logic.delete(id);
                } catch (NumberFormatException nfe) {
                    LOGGER.error(nfe.getMessage(), nfe);
                }
                return result;
            };
        }
    }




