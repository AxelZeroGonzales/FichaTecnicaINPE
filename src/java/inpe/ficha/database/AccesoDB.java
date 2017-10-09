package inpe.ficha.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class AccesoDB {

    private AccesoDB() {
    }

    public static Connection getConnection() throws SQLException {
        Connection cn = null;
        try {
            // Parámetros de Connexión
            String driver = "oracle.jdbc.OracleDriver";
            String url = "jdbc:oracle:thin:@localhost:1521:XE";
            String user = "empresa";
            String pwd = "admin";
            // carga driver en memoria
            Class.forName(driver).newInstance();
            //obtener la conexion a la BD.
            cn = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException e) {
            throw e;
        } catch (ClassNotFoundException ex) {
            throw new SQLException("No se encontró el driver de la base de dato.");
        } catch (InstantiationException | IllegalAccessException e) {
            throw new SQLException("No se puede acceder a la base de datos.");
        }
        return cn;
    }

}
