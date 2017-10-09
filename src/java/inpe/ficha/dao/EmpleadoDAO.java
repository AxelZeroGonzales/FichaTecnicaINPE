package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.EmpleadoTO;
import inpe.ficha.service.ICrudDao;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EmpleadoDAO implements ICrudDao<EmpleadoTO> {

    //variables
    Connection cn;
    PreparedStatement ps;//lo que voy a enviar a la base de datos
    CallableStatement cs; 
    ResultSet rs;// muestra el resultado obtenido deoracle
    EmpleadoTO emp;
    String sql;

    @Override
    public void create(EmpleadoTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            String codigo = generaCodigo();
            t.setIdempleado(codigo);
            cs = cn.prepareCall("{call usp_Empleado_Adicionar(?,?,?,?,?,?,?)}");
            cs.setString(1, t.getIdempleado());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getApellido());
            cs.setString(7, t.getCargo());
            cs.setString(6, t.getTelefono());
            cs.setString(5, t.getFecha());
            cs.setString(4, t.getRucdni());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }
    
    @Override
    public void update(EmpleadoTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Empleado_Actualiza(?,?,?,?,?,?,?)}");
            cs.setString(1, t.getIdempleado());
            cs.setString(2, t.getNombre());
            cs.setString(3, t.getApellido());
            cs.setString(7, t.getCargo());
            cs.setString(6, t.getTelefono());
            cs.setString(5, t.getFecha());
            cs.setString(4, t.getRucdni());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public void delete(EmpleadoTO t) throws Exception {
        try {
            cn = AccesoDB.getConnection();
            cs = cn.prepareCall("{call usp_Empleado_Eliminar(?)}");
            cs.setString(1, t.getIdempleado());
            cs.executeUpdate();
            cs.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
    }

    @Override
    public EmpleadoTO findForId(Object t) throws Exception {
        emp = null;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from empleados where idempleado=?");
            ps.setString(1, (String) t);
            rs = ps.executeQuery();//ejecuta
            if (rs.next()) {
                emp = new EmpleadoTO(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return emp;
    }

    @Override
    public List<EmpleadoTO> readAll() throws Exception {
        List<EmpleadoTO> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from empleados");
            rs = ps.executeQuery();
            while (rs.next()) {
                emp = new EmpleadoTO(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                lista.add(emp);
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

    public List<EmpleadoTO> readAll(String nombre) throws Exception {
        List<EmpleadoTO> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from empleados where nombre like ?");
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                emp = new EmpleadoTO(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                lista.add(emp);
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

    public List<EmpleadoTO> readAll2(String cargo) throws SQLException {
        List<EmpleadoTO> lista = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from empleados where cargo like ?");
            ps.setString(1, cargo + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                emp = new EmpleadoTO(rs.getString(1), rs.getString(2),
                        rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7));
                lista.add(emp);
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



    private String generaCodigo() throws SQLException {
        sql = "select valor from control where parametro='Empleados'";
        ps = cn.prepareStatement(sql);
        rs = ps.executeQuery();
        rs.next();
        int cont = rs.getInt(1);
        rs.close();
        sql = "update control set valor=valor+1 where parametro='Empleados'";
        ps = cn.prepareStatement(sql);
        ps.executeUpdate();
        ps.close();
        String cod = "";
        if (cont < 10) {
            cod = "E000" + cont;
        } else {
            cod = "E00" + cont;
        }
        return cod;
    }

    public boolean validar(String usuario, String clave) throws Exception {
        boolean ok = false;
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from empleados where usuario=? and clave=?");
            ps.setString(1, usuario);
            ps.setString(2, clave);
            rs = ps.executeQuery();
            if (rs.next()) {
                ok = true;
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            throw e;
        } finally {
            cn.close();
        }
        return ok;
    }

    public String findForName(String nombre) throws Exception {
        String cod = null;
        StringTokenizer token = new StringTokenizer(nombre);
        String nom = token.nextToken();
        String ape = token.nextToken();
        try {
            cn = AccesoDB.getConnection();
            sql = "select IdEmpleado from empleados where nombre=? and apellidos=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setString(2, ape);
            //ejecutar comando
            rs = ps.executeQuery();
            if (rs.next()) {
                cod = rs.getString(1);
            }
            rs.close();
        } catch (SQLException ex) {
            throw ex;
        } finally {
            cn.close();
        }
        return cod;
    }

   
     

}
