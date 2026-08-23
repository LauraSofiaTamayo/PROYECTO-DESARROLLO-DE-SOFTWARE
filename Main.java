import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {

        //PRUEBA DE CUENTA

        Cuenta cuenta = new Cuenta("001", new BigDecimal("100000"));

        cuenta.depositar(new BigDecimal("50000"));

        System.out.println("Saldo final: $" + cuenta.getSaldo() + " COP");


        // PRUEBA DE CUENTA CORRIENTE
      
        CuentaCorriente cuentaCorriente =
                new CuentaCorriente(
                        "002",
                        new BigDecimal("100000"),
                        new BigDecimal("50000")
                );

        cuentaCorriente.debitar(new BigDecimal("120000"));

        System.out.println(
                "Saldo cuenta corriente: $" + cuentaCorriente.getSaldo() + " COP"
        );


        // PRUEBA DE PAGOS
      
        Pedido pedido = new Pedido(new BigDecimal("80000"));
      
        CheckoutService checkout = new CheckoutService();

        // Pago en efectivo
        Pago pagoEfectivo = new PagoEfectivo();
        checkout.finalizarCompra(pedido, pagoEfectivo);

        // Pago con tarjeta
        Pago pagoTarjeta = new PagoTarjeta("1234567890");
        checkout.finalizarCompra(pedido, pagoTarjeta);

        // Pago por transferencia
        Pago pagoTransferencia = new PagoTransferencia("12345");
        checkout.finalizarCompra(pedido, pagoTransferencia);
    }
}
