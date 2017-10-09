/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.Provincias;
import inpe.ficha.service.DataFija;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

/**
 *
 * @author Axel
 */
public class ProvinciaDAO implements DataFija<Provincias>{
    Connection cn = null; 
    CallableStatement cs=null;
    ResultSet rs = null;
    String sql = "";
    Provincias prov=null;
    
    @Override
    public Provincias findForId(Object t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "{call usp_listar_provincias}";
            cs=cn.prepareCall(sql);
            cs.setString(1, (String) t);
            rs = cs.executeQuery(sql);
            if (rs.next()) {
                prov= new Provincias(rs.getString(1));
            }
            rs.close();
            cs.close();
        } catch (Exception e) {
            throw e;
        } finally {
            try {
                cn.close();
            } catch (Exception e) {
            }
        }
        return prov;
    }
    
}
