package inpe.ficha.dao;

import inpe.ficha.database.AccesoDB;
import inpe.ficha.entity.Producto;
import inpe.ficha.service.IConsulta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PenalDao implements IConsulta<Producto> {

    //variables de JDBC
    Connection cn;
    PreparedStatement ps;
    ResultSet rs;
    String sql;
    Producto pro;

    @Override
    public List<Producto> listar() throws Exception {
        List<Producto> productos = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            ps = cn.prepareStatement("select * from productos");
            rs = ps.executeQuery();
            while (rs.next()) {
                pro = new Producto();
                pro.setIdproducto(rs.getString(1));
                pro.setDescripcion(rs.getString(2));
                pro.setIdlinea(rs.getInt(3));
                pro.setPreciocompra(rs.getDouble(4));
                pro.setPrecioventa(rs.getDouble(5));
                pro.setStock(rs.getInt(6));
                productos.add(pro);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            try {
                cn.close();
            } catch (SQLException e1) {
            }
            throw e;
        }
        return productos;
    }//fin de metodo

    @Override
    public List<Producto> listar(String nombre) throws Exception {
        List<Producto> productos = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select * from productos where descripcion like ?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, nombre + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                pro = new Producto();
                pro.setIdproducto(rs.getString(1));
                pro.setDescripcion(rs.getString(2));
                pro.setIdlinea(rs.getInt(3));
                pro.setPreciocompra(rs.getDouble(4));
                pro.setPrecioventa(rs.getDouble(5));
                pro.setStock(rs.getInt(6));
                productos.add(pro);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            try {
                cn.close();
            } catch (SQLException e1) {
            }
            throw e;
        }
        return productos;
    }

    @Override
    public List<Producto> listar(int id) throws Exception {
        List<Producto> productos = new ArrayList<>();
        try {
            cn = AccesoDB.getConnection();
            sql = "select * from productos where idlinea=?";
            ps = cn.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                pro = new Producto();
                pro.setIdproducto(rs.getString(1));
                pro.setDescripcion(rs.getString(2));
                pro.setIdlinea(rs.getInt(3));
                pro.setPreciocompra(rs.getDouble(4));
                pro.setPrecioventa(rs.getDouble(5));
                pro.setStock(rs.getInt(6));
                productos.add(pro);
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            try {
                cn.close();
            } catch (SQLException e1) {
            }
            throw e;
        }
        return productos;
    }

    @Override
    public Producto buscar(String id) throws Exception {
        pro = null;
        try {
            cn = AccesoDB.getConnection();
            sql = "select * from productos where idproducto=?";
            ps = cn.prepareStatement(sql);
            ps.setString(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                pro = new Producto();
                pro.setIdproducto(rs.getString(1));
                pro.setDescripcion(rs.getString(2));
                pro.setIdlinea(rs.getInt(3));
                pro.setPreciocompra(rs.getDouble(4));
                pro.setPrecioventa(rs.getDouble(5));
                pro.setStock(rs.getInt(6));
            }
            rs.close();
            ps.close();
        } catch (SQLException e) {
            try {
                cn.close();
            } catch (SQLException e1) {
            }
            throw e;
        }
        return pro;
    }

}
