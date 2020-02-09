package ru.job4j.auth;

import ru.job4j.model.User;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;


public class AuthFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;

        if (httpServletRequest.getRequestURI().contains("/loginsecurity")) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            HttpSession httpSession = httpServletRequest.getSession();
            synchronized (httpSession) {
                User user = (User)httpSession.getAttribute("user");
                if (user == null) {
                    ((HttpServletResponse) servletResponse).sendRedirect(String.format("%s/loginsecurity", httpServletRequest.getContextPath()));
                    return;
                }

                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
    }

    @Override
    public void destroy() {

    }
}
