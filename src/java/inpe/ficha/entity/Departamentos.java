
package inpe.ficha.entity;

public class Departamentos {
    private int codigo;
    private String nombre_departamento;

    public Departamentos(String nombre_departamento) {
        this.nombre_departamento = nombre_departamento;
    }

    @Override
    public String toString() {
        return nombre_departamento;
    }

   



    
}
