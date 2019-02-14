package pl.adamLupinski.servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletLifecycle")
public class ServletLifecycle extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Method doGet");
    }

    public ServletLifecycle() {
        super();
        System.out.println("Servlet Constructor");
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Method init");
    }

    @Override
    public void destroy() {
        System.out.println("Method destroy");
    }

}

