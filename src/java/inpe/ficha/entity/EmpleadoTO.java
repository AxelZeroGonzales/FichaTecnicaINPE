package inpe.ficha.entity;

public class EmpleadoTO {

    private String idempleado;
    private String Nombre;
    private String Apellido;
    private String rucdni;
    private String fecha;
    private String telefono;
    private String cargo;

    public EmpleadoTO() {
    }

    public EmpleadoTO(String idempleado, String Nombre, String Apellido, String rucdni, String fecha, String telefono, String cargo) {
        this.idempleado = idempleado;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.rucdni = rucdni;
        this.fecha = fecha;
        this.telefono = telefono;
        this.cargo = cargo;
    }



    public EmpleadoTO(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public String getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(String idempleado) {
        this.idempleado = idempleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getRucdni() {
        return rucdni;
    }

    public void setRucdni(String rucdni) {
        this.rucdni = rucdni;
    }

}
