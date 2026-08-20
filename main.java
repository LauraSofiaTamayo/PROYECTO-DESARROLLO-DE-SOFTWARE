import java.math.BigDecimal;

public class Main {

    public static void main(String[] args) {
        System.out.println("Sistema de pagos");

        Cuenta cuenta = new Cuenta("001", new BigDecimal("100000"));

        System.out.println("Saldo inicial: " + cuenta.getSaldo());
    }
}
