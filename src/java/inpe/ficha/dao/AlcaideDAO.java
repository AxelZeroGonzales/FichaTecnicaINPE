/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.Alcaide;
import inpe.ficha.service.Combo;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Axel
 */
public class AlcaideDAO implements Combo<Alcaide> {
    
    Connection cn = null; 
    CallableStatement cs=null;
    ResultSet rs = null;
    String sql = "";
    Alcaide alc=null;
    @Override
    public List<Alcaide> readAll() throws Exception {
      List<Alcaide> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{usp_lista_alcaide}");
            rs = cs.executeQuery();
            while (rs.next()) {
                alc = new Alcaide(rs.getInt(1),rs.getString(2));
                lista.add(alc);
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
