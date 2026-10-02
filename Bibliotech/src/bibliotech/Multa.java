package bibliotech;

public class Multa {

    private int idMulta;
    private int idPrestamo;
    private int diasRetraso;
    private double monto;
    private String estado;

    public Multa() {
    }

    public Multa(int idMulta, int idPrestamo, int diasRetraso,
                 double monto, String estado) {

        this.idMulta = idMulta;
        this.idPrestamo = idPrestamo;
        this.diasRetraso = diasRetraso;
        this.monto = monto;
        this.estado = estado;
    }

    public int getIdMulta() {
        return idMulta;
    }

    public void setIdMulta(int idMulta) {
        this.idMulta = idMulta;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public int getDiasRetraso() {
        return diasRetraso;
    }

    public void setDiasRetraso(int diasRetraso) {
        this.diasRetraso = diasRetraso;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Multa{" +
                "idMulta=" + idMulta +
                ", idPrestamo=" + idPrestamo +
                ", diasRetraso=" + diasRetraso +
                ", monto=" + monto +
                ", estado='" + estado + '\'' +
                '}';
    }
}
