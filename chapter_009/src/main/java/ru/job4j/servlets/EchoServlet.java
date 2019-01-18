package ru.job4j.servlets;

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
public class EchoServlet extends HttpServlet {

    private static final Logger log = LoggerFactory.getLogger(EchoServlet.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        writer.write("<html>\n" +
                " <head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>Таблица размеров обуви</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "  <table border=\"1\">\n" +
                "   <caption>Таблица размеров обуви</caption>\n" +
                "   <tr>\n" +
                "    <th>Россия</th>\n" +
                "    <th>Великобритания</th>\n" +
                "    <th>Европа</th>\n" +
                "    <th>Длина ступни, см</th>\n" +
                "   </tr>\n" +
                "   <tr><td>34,5</td><td>3,5</td><td>36</td><td>23</td></tr>\n" +
                "   <tr><td>35,5</td><td>4</td><td>36⅔</td><td>23–23,5</td></tr>\n" +
                "   <tr><td>36</td><td>4,5</td><td>37⅓</td><td>23,5</td></tr>\n" +
                "   <tr><td>36,5</td><td>5</td><td>38</td><td>24</td></tr>\n" +
                "   <tr><td>37</td><td>5,5</td><td>38⅔</td><td>24,5</td></tr>\n" +
                "   <tr><td>38</td><td>6</td><td>39⅓</td><td>25</td></tr>\n" +
                "   <tr><td>38,5</td><td>6,5</td><td>40</td><td>25,5</td></tr>\n" +
                "   <tr><td>39</td><td>7</td><td>40⅔</td><td>25,5–26</td></tr>\n" +
                "   <tr><td>40</td><td>7,5</td><td>41⅓</td><td>26</td></tr>\n" +
                "   <tr><td>40,5</td><td>8</td><td>42</td><td>26,5</td></tr>\n" +
                "   <tr><td>41</td><td>8,5</td><td>42⅔</td><td>27</td></tr>\n" +
                "   <tr><td>42</td><td>9</td><td>43⅓</td><td>27,5</td></tr>\n" +
                "   <tr><td>43</td><td>9,5</td><td>44</td><td>28</td></tr>\n" +
                "   <tr><td>43,5</td><td>10</td><td>44⅔</td><td>28–28,5</td></tr>\n" +
                "   <tr><td>44</td><td>10,5</td><td>45⅓</td><td>28,5–29</td></tr>\n" +
                "   <tr><td>44,5</td><td>11</td><td>46</td><td>29</td></tr>\n" +
                "   <tr><td>45</td><td>11,5</td><td>46⅔</td><td>29,5</td></tr>\n" +
                "   <tr><td>46</td><td>12</td><td>47⅓</td><td>30</td></tr>\n" +
                "   <tr><td>46,5</td><td>12,5</td><td>48</td><td>30,5</td></tr>\n" +
                "   <tr><td>47</td><td>13</td><td>48⅔</td><td>31</td></tr>\n" +
                "   <tr><td>48</td><td>13,5</td><td>49⅓</td><td>31,5</td></tr>\n" +
                "  </table>\n" +
                " </body>\n" +
                "</html>");
        writer.flush();
    }
}

