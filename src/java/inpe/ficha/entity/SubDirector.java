
package inpe.ficha.entity;

public class SubDirector {
    private int codigo;
    private String nombre_subDirector;

    public SubDirector(int codigo, String nombre_subDirector) {
        this.codigo = codigo;
        this.nombre_subDirector = nombre_subDirector;
    }

    @Override
    public String toString() {
        return nombre_subDirector;
    }

    
}
