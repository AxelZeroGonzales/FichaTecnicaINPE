/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.Alcaide;
import inpe.ficha.entity.SubDirector;
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
public class SubDirectorDAO implements Combo<SubDirector>{

Connection cn = null; 
    CallableStatement cs=null;
    ResultSet rs = null;
    String sql = "";
    SubDirector subDir=null;
    
    @Override
    public List<SubDirector> readAll() throws Exception {
      List<SubDirector> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{usp_lista_subDirector}");
            rs = cs.executeQuery();
            while (rs.next()) {
                subDir = new SubDirector(rs.getInt(1),rs.getString(2));
                lista.add(subDir);
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
