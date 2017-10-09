
package inpe.ficha.entity;

public class JefeSeguridad {
    private int codigo;
    private String nombre_jefeSeguridad;

    public JefeSeguridad(int codigo, String nombre_jefeSeguridad) {
        this.codigo = codigo;
        this.nombre_jefeSeguridad = nombre_jefeSeguridad;
    }

    @Override
    public String toString() {
        return  nombre_jefeSeguridad;
    }




    
    
}
