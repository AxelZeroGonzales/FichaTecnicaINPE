package inpe.ficha.entity;
public class AutoridadesDirectrices {
       private int id_penal;
       private String director;
       private String direc_telefono;
       private String subDirector;
       private String subDirec_telefono;
       private String jefe_seguridad;
       private String segur_telefono;
       private String alcaide_1;
       private String alcal1_telefono;
       private String alcaide_2;
       private String alcal2_telefono;
       private String alcaide_3;
       private String alcal3_telefono;

    public AutoridadesDirectrices(int id_penal, String director, String direc_telefono, String subDirector, String subDirec_telefono, String jefe_seguridad, String segur_telefono, String alcaide_1, String alcal1_telefono, String alcaide_2, String alcal2_telefono, String alcaide_3, String alcal3_telefono) {
        this.id_penal = id_penal;
        this.director = director;
        this.direc_telefono = direc_telefono;
        this.subDirector = subDirector;
        this.subDirec_telefono = subDirec_telefono;
        this.jefe_seguridad = jefe_seguridad;
        this.segur_telefono = segur_telefono;
        this.alcaide_1 = alcaide_1;
        this.alcal1_telefono = alcal1_telefono;
        this.alcaide_2 = alcaide_2;
        this.alcal2_telefono = alcal2_telefono;
        this.alcaide_3 = alcaide_3;
        this.alcal3_telefono = alcal3_telefono;
    }

    public int getId_penal() {
        return id_penal;
    }

    public void setId_penal(int id_penal) {
        this.id_penal = id_penal;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getDirec_telefono() {
        return direc_telefono;
    }

    public void setDirec_telefono(String direc_telefono) {
        this.direc_telefono = direc_telefono;
    }

    public String getSubDirector() {
        return subDirector;
    }

    public void setSubDirector(String subDirector) {
        this.subDirector = subDirector;
    }

    public String getSubDirec_telefono() {
        return subDirec_telefono;
    }

    public void setSubDirec_telefono(String subDirec_telefono) {
        this.subDirec_telefono = subDirec_telefono;
    }

    public String getJefe_seguridad() {
        return jefe_seguridad;
    }

    public void setJefe_seguridad(String jefe_seguridad) {
        this.jefe_seguridad = jefe_seguridad;
    }

    public String getSegur_telefono() {
        return segur_telefono;
    }

    public void setSegur_telefono(String segur_telefono) {
        this.segur_telefono = segur_telefono;
    }

    public String getAlcaide_1() {
        return alcaide_1;
    }

    public void setAlcaide_1(String alcaide_1) {
        this.alcaide_1 = alcaide_1;
    }

    public String getAlcal1_telefono() {
        return alcal1_telefono;
    }

    public void setAlcal1_telefono(String alcal1_telefono) {
        this.alcal1_telefono = alcal1_telefono;
    }

    public String getAlcaide_2() {
        return alcaide_2;
    }

    public void setAlcaide_2(String alcaide_2) {
        this.alcaide_2 = alcaide_2;
    }

    public String getAlcal2_telefono() {
        return alcal2_telefono;
    }

    public void setAlcal2_telefono(String alcal2_telefono) {
        this.alcal2_telefono = alcal2_telefono;
    }

    public String getAlcaide_3() {
        return alcaide_3;
    }

    public void setAlcaide_3(String alcaide_3) {
        this.alcaide_3 = alcaide_3;
    }

    public String getAlcal3_telefono() {
        return alcal3_telefono;
    }

    public void setAlcal3_telefono(String alcal3_telefono) {
        this.alcal3_telefono = alcal3_telefono;
    }
       
       
}
