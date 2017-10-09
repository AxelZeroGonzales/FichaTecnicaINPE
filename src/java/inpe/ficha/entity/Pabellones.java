
package inpe.ficha.entity;
public class Pabellones {
    private int id_penal;
    private String nombrepabellon;
    private String cantidadpabellon;

    public Pabellones(int id_penal, String nombrepabellon, String cantidadpabellon) {
        this.id_penal = id_penal;
        this.nombrepabellon = nombrepabellon;
        this.cantidadpabellon = cantidadpabellon;
    }

    public int getId_penal() {
        return id_penal;
    }

    public void setId_penal(int id_penal) {
        this.id_penal = id_penal;
    }

    public String getNombrepabellon() {
        return nombrepabellon;
    }

    public void setNombrepabellon(String nombrepabellon) {
        this.nombrepabellon = nombrepabellon;
    }

    public String getCantidadpabellon() {
        return cantidadpabellon;
    }

    public void setCantidadpabellon(String cantidadpabellon) {
        this.cantidadpabellon = cantidadpabellon;
    }
    
}
