/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 *
 * @author LENOVO
 */
@WebServlet(name = "ServletCountry",
        urlPatterns = { "/Listar","/ConsultarPais"})
public class ServletCountry extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String path = request.getServletPath();

        if (path.equals("/ConsultarPais")) {
            consultar(request, response);
        }
    }

    private void consultar(HttpServletRequest request,
            HttpServletResponse response) throws IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try {
            String cuenta = request.getParameter("txtcountry_id");
            // mostrar datos de empleado en la pagina
            out.println("Country_Id: " );
        } catch (Exception e) {
            out.println("ERROR: " + e.getMessage());
        } finally {
            out.flush();
            out.close();
        }

    }
     

}


