import java.util.*;

public class CuentaBancariaDinamica {
    double saldo = 0;

    public void Deposito(double dinero){
        saldo = saldo + dinero;
        System.out.println("Deposito Exitoso! Tu saldo actual es: " + saldo);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaBancariaDinamica miCuenta = new CuentaBancariaDinamica();

        System.out.println("Cuanto deseas ingresar a la cuenta?: ");
        double ingreso = teclado.nextDouble();
        miCuenta.Deposito(ingreso);

        teclado.close();
    }
}
