package inpe.ficha.entity;
public class TitulacionPenal {
    private int id_penal;
    private boolean registroPublicos;
    private boolean registroSBN;
    private boolean localPropio;
    private boolean localAlquilado;
    private boolean regularizar;

    public TitulacionPenal(int id_penal, boolean registroPublicos, boolean registroSBN, boolean localPropio, boolean localAlquilado, boolean regularizar) {
        this.id_penal = id_penal;
        this.registroPublicos = registroPublicos;
        this.registroSBN = registroSBN;
        this.localPropio = localPropio;
        this.localAlquilado = localAlquilado;
        this.regularizar = regularizar;
    }

    public int getId_penal() {
        return id_penal;
    }

    public void setId_penal(int id_penal) {
        this.id_penal = id_penal;
    }

    public boolean isRegistroPublicos() {
        return registroPublicos;
    }

    public void setRegistroPublicos(boolean registroPublicos) {
        this.registroPublicos = registroPublicos;
    }

    public boolean isRegistroSBN() {
        return registroSBN;
    }

    public void setRegistroSBN(boolean registroSBN) {
        this.registroSBN = registroSBN;
    }

    public boolean isLocalPropio() {
        return localPropio;
    }

    public void setLocalPropio(boolean localPropio) {
        this.localPropio = localPropio;
    }

    public boolean isLocalAlquilado() {
        return localAlquilado;
    }

    public void setLocalAlquilado(boolean localAlquilado) {
        this.localAlquilado = localAlquilado;
    }

    public boolean isRegularizar() {
        return regularizar;
    }

    public void setRegularizar(boolean regularizar) {
        this.regularizar = regularizar;
    }
    
    
}
