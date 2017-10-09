
package inpe.ficha.entity;
public class Penal {
    private int codigo;
    private String nombre_penal;
    private String oficina_regional;

    public Penal(int codigo, String nombre_penal, String oficina_regional) {
        this.codigo = codigo;
        this.nombre_penal = nombre_penal;
        this.oficina_regional = oficina_regional;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre_penal() {
        return nombre_penal;
    }

    public void setNombre_penal(String nombre_penal) {
        this.nombre_penal = nombre_penal;
    }

    public String getOficina_regional() {
        return oficina_regional;
    }

    public void setOficina_regional(String oficina_regional) {
        this.oficina_regional = oficina_regional;
    }
    
    
}
