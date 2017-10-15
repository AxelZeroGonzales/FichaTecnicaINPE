/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.controller;

import inpe.ficha.dao.PenalDao;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Axel
 */
@WebServlet(name = "Adminservlet",
        urlPatterns = {"/ListarXnombre"})
public class AdminServlet extends HttpServlet {
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();
        try {
            switch (path) {
                case "/ListarXnombre":
                    listarPorNombre(request, response);
                    break;
                case "/ListarXlinea":
                    listarPorLinea(request, response);
                    break;
            }
        } catch (Exception e) {
        }
        
    }
    private void listarPorNombre(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destino = "";
        try {
            String nombre = request.getParameter("txtnombre");
            PenalDao dao = new PenalDao();
            request.setAttribute("listado", dao.listar(nombre));
            destino = "listarxnombre.jsp";
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }
        RequestDispatcher rd = request.getRequestDispatcher(destino);
        rd.forward(request, response);
    }

    private void listarPorLinea(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String destino = "";
        try {
            int linea = Integer.parseInt(request.getParameter("txtidlinea"));
            PenalDao dao = new PenalDao();
            request.setAttribute("listado", dao.listar(linea));
            destino = "listarxlinea.jsp";
        } catch (Exception e) {
            request.setAttribute("error", e.getMessage());
        }
        RequestDispatcher rd = request.getRequestDispatcher(destino);
        rd.forward(request, response);
    }


}
