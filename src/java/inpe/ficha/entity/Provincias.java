
package inpe.ficha.entity;

public class Provincias {
    private int codigo;
    private String nombre_provincias;

    public Provincias(String nombre_provincias) {
        this.nombre_provincias = nombre_provincias;
    }

    @Override
    public String toString() {
        return nombre_provincias;
    }


    
}
