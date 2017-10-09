
package inpe.ficha.entity;

public class Alcaide {
    private int codigo;
    private String nombre_Alcaide;

    public Alcaide(int codigo, String nombre_Alcaide) {
        this.codigo = codigo;
        this.nombre_Alcaide = nombre_Alcaide;
    }

    @Override
    public String toString() {
        return nombre_Alcaide;
    }




    
}
