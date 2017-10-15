<%-- 
    Document   : listarxlinea
    Created on : 09/04/2017, 04:44:37 PM
    Author     : Alumno
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Productos x linea</title>
    </head>
    <body>
      <h2>Productos por Linea</h2>
        <div>
            <form action="ListarXlinea" method="POST">
                <p>
                    Ingrese IdLinea:<input type="text" name="txtidlinea" value="" />
                    <input type="submit" value="Ver Productos" />
                </p>                 
                    
            <table border="1">
                <thead>
                    <tr>
                        <th colspan="5">Productos Por Linea</th>                       
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Codigo</td>
                        <td>Nombre Producto</td>
                        <td>IdLinea</td>
                        <td>Precio</td>
                        <td>Stock</td>
                    </tr>
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
        <div><a href="index.html">Regresar a Index</a></div>
        </div> 
    </body>
</html>
