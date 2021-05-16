package ru.job4j.servlet;



import ru.job4j.service.HibernateUtil;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class ViewItemsServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/create");
        requestDispatcher.forward(req, resp);


      /*  resp.setContentType("text/html");
        List<Item> items = HibernateUtil.getInstance().getAllItems(Boolean.parseBoolean(req.getParameter("done")));
        PrintWriter writer = resp.getWriter();
        ObjectMapper mapper = new ObjectMapper();
        writer.append(mapper.writeValueAsString(items));
        writer.flush();*/
    }
}