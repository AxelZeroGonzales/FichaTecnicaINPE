
package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.Alcaide;
import inpe.ficha.entity.JefeSeguridad;
import inpe.ficha.service.Combo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class JefeSeguridadDAO implements Combo<JefeSeguridad>{

    Connection cn = null; 
    CallableStatement cs=null;
    ResultSet rs = null;
    String sql = "";
    JefeSeguridad jefSe=null;
    
    @Override
    public List<JefeSeguridad> readAll() throws Exception {
      List<JefeSeguridad> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{usp_lista_JefeSeguridad}");
            rs = cs.executeQuery();
            while (rs.next()) {
                jefSe = new JefeSeguridad(rs.getInt(1),rs.getString(2));
                lista.add(jefSe);
            }
            rs.close();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }
    
}
