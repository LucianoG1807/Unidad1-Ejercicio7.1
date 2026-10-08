public class main {
    static void main(String[] args) {

            Factura factura = new Factura(
                    "0001",
                    "Luciano Gonzalez",
                    10000);

            double iva = factura.getMontoNeto() * 0.21;
            double total = factura.calcularTotalConIVA();

            System.out.println("Número de factura: " + factura.getNumeroFactura());
            System.out.println("Cliente: " + factura.getCliente());
            System.out.println("Monto neto: $" + factura.getMontoNeto());
            System.out.println("IVA (21%): $" + iva);
            System.out.println("Total con IVA: $" + total);
        }
    }

