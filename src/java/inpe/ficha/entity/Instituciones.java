package inpe.ficha.entity;
public class Instituciones {
    private int id_penal;
    private boolean direccion;
    private boolean seguridad_interna;
    private boolean seguridad_externa;

    public Instituciones(int id_penal, boolean direccion, boolean seguridad_interna, boolean seguridad_externa) {
        this.id_penal = id_penal;
        this.direccion = direccion;
        this.seguridad_interna = seguridad_interna;
        this.seguridad_externa = seguridad_externa;
    }

    public int getId_penal() {
        return id_penal;
    }

    public void setId_penal(int id_penal) {
        this.id_penal = id_penal;
    }

    public boolean isDireccion() {
        return direccion;
    }

    public void setDireccion(boolean direccion) {
        this.direccion = direccion;
    }

    public boolean isSeguridad_interna() {
        return seguridad_interna;
    }

    public void setSeguridad_interna(boolean seguridad_interna) {
        this.seguridad_interna = seguridad_interna;
    }

    public boolean isSeguridad_externa() {
        return seguridad_externa;
    }

    public void setSeguridad_externa(boolean seguridad_externa) {
        this.seguridad_externa = seguridad_externa;
    }
    
    
}
