<%-- 
    Document   : Admin
    Created on : 14/10/2017, 04:37:42 PM
    Author     : Axel
--%>

<%@page import="java.util.List"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="inpe.ficha.entity.LineaTO"%>
<%@page import="inpe.ficha.dao.LineaDAO"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <!-- Metadatos -->
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="author" content="Tomas Acuña, ...">
        <meta name="description" content="Ficha técnica situacional de los establecimientos penitenciarios">
        <title>Ficha técnica situacional de los establecimientos penitenciarios</title>
        <!-- Metadatos Link -->
        <meta property="og:title" content="Instituto Nacional Penitenciario"/>
        <!-- <meta property="og:url" content="#" /> -->
        <meta property="og:image" content="img/pv.jpg" />
        <link rel="shortcut icon" type="image/x-icon" href="img/favicon.ico"/>
        <%
            LineaDAO dao = new LineaDAO();
            List<LineaTO> lineas = dao.readAll();
        %>

        <!-- Bootstrap CSS -->
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css" integrity="sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="css/font-awesome.min.css">
        <link rel="stylesheet" type="text/css" href="css/main.css">
    </head>

    <body>


        <div class="contenido col-md-12">
            <div class="inicio">
                <h2>Ficha técnica situacional de los establecimientos penitenciarios</h2>
                <hr>
            </div>
            <form action="ListarXlinea" method="POST">
                <!--Datos encabezado-->
                <fieldset disabled>
                    <div class="form-row">
                        <div class="form-group col-md-6">
                            <label for="oregional">Oficina Regional</label>
                            <select name="cbolinea"  id="cbolinea">
                                <%for (LineaTO pro : lineas) {%>
                                <option type="sumit" value="<%=pro.getIdlinea()%>"><%=pro.getCountry_Name()%></option>
                                <%}%>
                            </select>
                        </div>
                        <div class="form-group col-md-6">
                            <label for="epenitenciario">Establecimiento Penitenciario</label>
                            <input type="text" class="form-control form-control-sm" id="epenitenciario" placeholder="[Nombre del Establecimiento Penitenciario]">
                        </div>
                    </div>
                </fieldset>
                <table class="table table-bordered" id="tablaControl" >
                    <thead>
                        <tr>
                            <th class="col-md-1 col-form-label text-secondary" >N°</label</th>
                            <th class="col-md-2 col-form-label text-secondary">Penal</th>
                            <th class="col-md-2 col-form-label text-secondary">Director</th>
                            <th class="col-md-2 col-form-label text-secondary">Ultima Actualizacion</th>
                            <th class="col-md-2 col-form-label text-secondary">Periodo</th>
                            <th class="col-md-2 col-form-label text-secondary">Formulario</th>
                            <th class="col-md-2 col-form-label text-secondary">PDF</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="item" items="${requestScope.listado}">                
                            <tr>
                                <td>${item.idproducto}</td>
                                <td>${item.descripcion}</td>
                                <td>${item.idlinea}</td>
                                <td>${item.precioventa}</td>
                                <td>${item.stock}</td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </form>      
        </div>

        <!-- Bootstrap JavaScript -->
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js" integrity="sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1" crossorigin="anonymous"></script>

    </body>
   

