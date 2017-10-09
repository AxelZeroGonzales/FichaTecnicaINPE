package inpe.ficha.entity;
public class AreaTerreno {
   private int id_penal;
   private double areaTotal;
   private double areaConstruida;
   private double areaSinConstruir;

    public AreaTerreno(int id_penal, double areaTotal, double areaConstruida, double areaSinConstruir) {
        this.id_penal = id_penal;
        this.areaTotal = areaTotal;
        this.areaConstruida = areaConstruida;
        this.areaSinConstruir = areaSinConstruir;
    }

    public int getId_penal() {
        return id_penal;
    }

    public void setId_penal(int id_penal) {
        this.id_penal = id_penal;
    }

    public double getAreaTotal() {
        return areaTotal;
    }

    public void setAreaTotal(double areaTotal) {
        this.areaTotal = areaTotal;
    }

    public double getAreaConstruida() {
        return areaConstruida;
    }

    public void setAreaConstruida(double areaConstruida) {
        this.areaConstruida = areaConstruida;
    }

    public double getAreaSinConstruir() {
        return areaSinConstruir;
    }

    public void setAreaSinConstruir(double areaSinConstruir) {
        this.areaSinConstruir = areaSinConstruir;
    }
   
}
