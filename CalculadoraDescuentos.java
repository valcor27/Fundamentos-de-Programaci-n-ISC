import java.util.Scanner;

public class CalculadoraDescuentos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el monto total de la compra: $");
        double monto = scanner.nextDouble();

        if (monto <= 0) {
            System.out.println("\nError: El monto de la compra debe ser mayor a 0.");
        } else {
            System.out.println("\n--- Tipo de Cliente ---");
            System.out.println("1. Estudiante (15% de descuento)");
            System.out.println("2. Adulto Mayor (25% de descuento)");
            System.out.println("3. Cliente VIP (10% de descuento)");
            System.out.println("4. Cliente Regular (Sin descuento)");

            System.out.print("Elige una opción (1, 2, 3 o 4): ");
            int opcion = scanner.nextInt();

            double porcentajeDescuento = 0.0;
            boolean opcionValida = true;

            if (opcion == 1) {
                porcentajeDescuento = 0.15;
            } else if (opcion == 2) {
                porcentajeDescuento = 0.25;
            } else if (opcion == 3) {
                porcentajeDescuento = 0.10;
            } else if (opcion == 4) {
                porcentajeDescuento = 0.0;
            } else {
                System.out.println("\nError: Opción inválida.");
                opcionValida = false;
            }

            if (opcionValida) {
                double dineroDescontado = monto * porcentajeDescuento;
                double subtotal = monto - dineroDescontado;

                System.out.println("\n--- Resumen de tu Compra ---");
                System.out.println("Monto inicial: $" + monto);
                System.out.println("Descuento aplicado: $" + dineroDescontado);
                System.out.println("Subtotal con descuento: $" + subtotal);

                // 5. Condicional anidado (un if para determinar el costo de envío)
                if (subtotal > 1000) {
                    System.out.println("Envío: ¡GRATIS!");
                    System.out.println("Total final a pagar: $" + subtotal);
                } else {
                    System.out.println("Envío: $150.0");
                    double totalFinal = subtotal + 150;
                    System.out.println("Total final a pagar: $" + totalFinal);
                }
            }
        }

        scanner.close();
    }
}