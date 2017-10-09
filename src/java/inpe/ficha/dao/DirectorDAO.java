/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.Alcaide;
import inpe.ficha.entity.Director;
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
public class DirectorDAO implements Combo<Director> {

    Connection cn = null; 
    CallableStatement cs=null;
    ResultSet rs = null;
    String sql = "";
    Director dir=null;
    
    @Override
    public List<Director> readAll() throws Exception {
      List<Director> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{usp_lista_director}");
            rs = cs.executeQuery();
            while (rs.next()) {
                dir = new Director(rs.getInt(1),rs.getString(2));
                lista.add(dir);
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
