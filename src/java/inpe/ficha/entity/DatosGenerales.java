
package inpe.ficha.entity;

public class DatosGenerales {
    private int id_penal;
    private int id_ubicacion;
    private String direccion;
    private String telefono;
    private String resolucion_creacion;
    private String regimen;

    public DatosGenerales(int id_penal, int id_ubicacion, String direccion, String telefono, String resolucion_creacion, String regimen) {
        this.id_penal = id_penal;
        this.id_ubicacion = id_ubicacion;
        this.direccion = direccion;
        this.telefono = telefono;
        this.resolucion_creacion = resolucion_creacion;
        this.regimen = regimen;
    }

    public int getId_penal() {
        return id_penal;
    }

    public void setId_penal(int id_penal) {
        this.id_penal = id_penal;
    }

    public int getId_ubicacion() {
        return id_ubicacion;
    }

    public void setId_ubicacion(int id_ubicacion) {
        this.id_ubicacion = id_ubicacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getResolucion_creacion() {
        return resolucion_creacion;
    }

    public void setResolucion_creacion(String resolucion_creacion) {
        this.resolucion_creacion = resolucion_creacion;
    }

    public String getRegimen() {
        return regimen;
    }

    public void setRegimen(String regimen) {
        this.regimen = regimen;
    }
    
    
    
}
