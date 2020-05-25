package ru.job4j.servlets2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


/**
 * Created by Comp on 06.11.2017.
 */
public class EchoServlet2 extends HttpServlet {

    private static final Logger LOG = LoggerFactory.getLogger(EchoServlet2.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter writer = res.getWriter();
        writer.write("<table>\n"
                + "  <colgroup>\n"
                + "    <col span=\"2\" style=\"background:Khaki\"><!-- С помощью этой конструкции задаем цвет фона для первых двух столбцов таблицы-->\n"
                + "    <col style=\"background-color:LightCyan\"><!-- Задаем цвет фона для следующего (одного) столбца таблицы-->\n"
                + "  </colgroup>\n"
                + "  <tr>\n"
                + "    <th>№ п/п</th>\n"
                + "    <th>Наименование</th>\n"
                + "    <th>Цена, руб.</th>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td>1</td>\n"
                + "    <td>Карандаш цветной</td>\n"
                + "    <td>20,00</td>\n"
                + "  </tr>\n"
                + "  <tr>\n"
                + "    <td>2</td>\n"
                + "    <td>Линейка 20 см</td>\n"
                + "    <td>30,00</td>\n"
                + "  </tr>\n"
                + "</table>");
        writer.flush();
    }
}
