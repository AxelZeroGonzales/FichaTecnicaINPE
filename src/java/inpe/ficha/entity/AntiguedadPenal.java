package inpe.ficha.entity;
public class AntiguedadPenal {
    private int id_penal;
    private String fechaConstruccion;
    private String fechaInaguracion;
    private String fechaFuncionamiento;

    public AntiguedadPenal(int id_penal, String fechaConstruccion, String fechaInaguracion, String fechaFuncionamiento) {
        this.id_penal = id_penal;
        this.fechaConstruccion = fechaConstruccion;
        this.fechaInaguracion = fechaInaguracion;
        this.fechaFuncionamiento = fechaFuncionamiento;
    }

    public int getId_penal() {
        return id_penal;
    }

    public void setId_penal(int id_penal) {
        this.id_penal = id_penal;
    }

    public String getFechaConstruccion() {
        return fechaConstruccion;
    }

    public void setFechaConstruccion(String fechaConstruccion) {
        this.fechaConstruccion = fechaConstruccion;
    }

    public String getFechaInaguracion() {
        return fechaInaguracion;
    }

    public void setFechaInaguracion(String fechaInaguracion) {
        this.fechaInaguracion = fechaInaguracion;
    }

    public String getFechaFuncionamiento() {
        return fechaFuncionamiento;
    }

    public void setFechaFuncionamiento(String fechaFuncionamiento) {
        this.fechaFuncionamiento = fechaFuncionamiento;
    }
    
}
