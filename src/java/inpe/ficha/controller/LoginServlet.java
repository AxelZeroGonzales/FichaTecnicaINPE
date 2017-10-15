/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.controller;

import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.err;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Alumno
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/LoginServlet"})
public class LoginServlet extends HttpServlet {

    public LoginServlet() {

    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("txtUserName");
        String pass = request.getParameter("txtPass");

        if (name.equalsIgnoreCase("axel") && pass.equalsIgnoreCase("pokemon")) {
            RequestDispatcher rd = request.getRequestDispatcher("Principal.html");
            request.setAttribute("nombre", name);
            rd.forward(request, response);
        } else {
            response.setContentType("Login.html");
        PrintWriter out = response.getWriter();
            // mostrar datos de empleado en la pagina
            out.println("El usuario o contraseña son incorrectos");
        }
    }

}
