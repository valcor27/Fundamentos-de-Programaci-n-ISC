import java.util.*;

public class CuentaBancariaDinamica {
    double saldo = 0;

    public void Deposito(double dinero) {
        if (dinero > 0) {
            saldo = saldo + dinero;
            System.out.println("Deposito Exitoso! Tu saldo actual es: $" + saldo);
        } else {
            System.out.println("El deposito debe ser mayor a 0");
        }
    }

    public void Retiro(double dinero) {
        double disponible = saldo;
        if (dinero > 0) {
            if (disponible >= dinero) {
                saldo = saldo - dinero;
                System.out.println(
                        "Retiro Exitoso! Se retiraron $" + dinero + ". Queda un total de: $" + saldo + " en tu cuenta");
            } else {
                System.out.println("No hay fondos suficientes");
            }
        } else {
            System.out.println("Retira una cantidad mayor que Cero");
        }
    }

    public void verSaldo() {
        double total = saldo;
        System.out.println("Total disponible es: $" + total);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        CuentaBancariaDinamica miCuenta = new CuentaBancariaDinamica();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=== CAJERO AUTOMÁTICO ===");
            System.out.println("1. Depositar");
            System.out.println("2. Retirar");
            System.out.println("3. Ver saldo");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuánto deseas ingresar a la cuenta?: ");
                    double ingreso = teclado.nextDouble();
                    miCuenta.Deposito(ingreso);
                    break;

                case 2:
                    System.out.print("¿Cuánto deseas retirar de la cuenta?: ");
                    double retiro = teclado.nextDouble();
                    miCuenta.Retiro(retiro);
                    break;

                case 3:
                    miCuenta.verSaldo();
                    break;

                case 4:
                    System.out.println("Saliendo del programa... ¡Gracias por usar el cajero!");
                    break;

                default:
                    System.out.println("Opción no válida. Por favor elige del 1 al 4.");
            }
        }

        teclado.close();
    }
}