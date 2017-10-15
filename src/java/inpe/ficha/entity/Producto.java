
package inpe.ficha.entity;

public class Producto {
 //atributos
    private String idproducto;
    private String descripcion;
    private int idlinea;
    private double preciocompra;
    private double precioventa;
    private int stock;
    //constructor

    public Producto() {
    }

    public Producto(String idproducto, String descripcion, int idlinea, double preciocompra, double precioventa, int stock) {
        this.idproducto = idproducto;
        this.descripcion = descripcion;
        this.idlinea = idlinea;
        this.preciocompra = preciocompra;
        this.precioventa = precioventa;
        this.stock = stock;
    }
    //metodos de encapsulacion:get y set

    public String getIdproducto() {
        return idproducto;
    }

    public void setIdproducto(String idproducto) {
        this.idproducto = idproducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdlinea() {
        return idlinea;
    }

    public void setIdlinea(int idlinea) {
        this.idlinea = idlinea;
    }

    public double getPreciocompra() {
        return preciocompra;
    }

    public void setPreciocompra(double preciocompra) {
        this.preciocompra = preciocompra;
    }

    public double getPrecioventa() {
        return precioventa;
    }

    public void setPrecioventa(double precioventa) {
        this.precioventa = precioventa;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
}
