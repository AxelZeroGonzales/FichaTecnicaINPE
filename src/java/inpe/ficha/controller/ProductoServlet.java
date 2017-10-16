/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.controller;

import inpe.ficha.dao.EmpleadoDAO;
import java.io.IOException;
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
@WebServlet(name = "ProductoServlet",
        urlPatterns = {"/Listarasd", "/ListarLinea", "/Consultar"})
public class ProductoServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        try {
            switch (path) {
                case "/Listar":
                    listarTodo(request, response);
                    break;
                case "/ListarLinea":
                    listarPorLinea(request, response);
                    break;
                case "/Consultar":
                    consultar(request, response);
                    break;
            }
        } catch (Exception e) {
        }
    }

    private void listarTodo(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String destino = "";
        try {
            EmpleadoDAO dao = new EmpleadoDAO();
            request.setAttribute("listado", dao.readAll());
            destino = "Admin.jsp";
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }
        RequestDispatcher rd = request.getRequestDispatcher(destino);
        rd.forward(request, response);
    }


    private void listarPorLinea(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destino = "";
        try {
            int linea = Integer.parseInt(request.getParameter("cbolinea"));
            EmpleadoDAO dao = new EmpleadoDAO();
            request.setAttribute("listado", dao.readAll());
            destino = "Admin.jsp";
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }
        RequestDispatcher rd = request.getRequestDispatcher(destino);
        rd.forward(request, response);
    }

    private void consultar(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destino = "";
        try {
            String codigo = request.getParameter("txtcodigo");
             EmpleadoDAO dao = new EmpleadoDAO();
            request.setAttribute("datos", dao.findForId(codigo));
            destino = "consultar.jsp";
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }
        RequestDispatcher rd = request.getRequestDispatcher(destino);
        rd.forward(request, response);
    }

}
