
package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.Departamentos;
import inpe.ficha.service.DataFija;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;

public class DepartamentoDAO implements DataFija<Departamentos>{
    Connection cn = null; 
    CallableStatement cs=null;
    ResultSet rs = null;
    String sql = "";
    Departamentos dep=null;
    
    @Override
    public Departamentos findForId(Object t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            sql = "{call usp_listar_provincias}";
            cs=cn.prepareCall(sql);
            cs.setString(1, (String) t);
            rs = cs.executeQuery(sql);
            if (rs.next()) {
                dep= new Departamentos(rs.getString(1));
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
        return dep;
    }
   
    
}
