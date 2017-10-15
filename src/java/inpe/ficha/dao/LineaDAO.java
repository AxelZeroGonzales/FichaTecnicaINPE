/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.EmpleadoTO;
import inpe.ficha.entity.LineaTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Axel
 */
public class LineaDAO {
     Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    LineaTO linea;

   public List<LineaTO> readAll() throws Exception {
        List<LineaTO> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from LineaTO");
            rs = ps.executeQuery();
            while (rs.next()) {
                linea = new LineaTO(rs.getInt(1), rs.getString(2));
                lista.add(linea);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return lista;
    }
}
