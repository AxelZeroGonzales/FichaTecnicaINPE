package inpe.ficha.database;

import java.sql.Connection;
import java.sql.SQLException;

public class Prueba {

    public static void main(String[] args) {
        // prueba conexion a la BD
        try {
            Connection cn = AccesoDB.getConnection();
            System.out.println("Conexion Conforme!!!");
        } catch (SQLException e) {
            System.out.println("error:" + e.getMessage());
        }
    }

}
