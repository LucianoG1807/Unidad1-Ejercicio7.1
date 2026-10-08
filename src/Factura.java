public class Factura {

    private String numeroFactura;
    private String cliente;
    private double montoNeto;

    public double getMontoNeto() {
        return montoNeto;
    }

    public String getCliente() {
        return cliente;
    }

    public String getNumeroFactura() {
        return numeroFactura;
    }

    public Factura(String numeroFactura, String cliente, double montoNeto) {
        this.numeroFactura = numeroFactura;
        this.cliente = cliente;

        if (montoNeto >= 0) {
            this.montoNeto = montoNeto;
        } else {
            throw new IllegalArgumentException("El monto neto no puede ser negativo.");
        }
    }

    public double calcularTotalConIVA() {
        return montoNeto * 1.21;
    }

}