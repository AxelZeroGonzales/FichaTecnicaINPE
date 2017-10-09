
package inpe.ficha.entity;

public class Director {
    private int codigo;
    private String nombre_Director;

    public Director(int codigo, String nombre_Director) {
        this.codigo = codigo;
        this.nombre_Director = nombre_Director;
    }

    @Override
    public String toString() {
        return  nombre_Director;
    }


    
}
