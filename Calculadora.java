import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        // Menú de opciones (se muestra solo una vez)
        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");

        System.out.print("Elige una opción (1, 2, 3 o 4): ");
        int opcion = scanner.nextInt();

        // Estructura condicional directa sin bucle
        if (opcion == 1) {
            double resultado = num1 + num2;
            System.out.println("\nEl resultado de la suma es: " + resultado);
        } else if (opcion == 2) {
            double resultado = num1 - num2;
            System.out.println("\nEl resultado de la resta es: " + resultado);
        } else if (opcion == 3) {
            double resultado = num1 * num2;
            System.out.println("\nEl resultado de la multiplicación es: " + resultado);
        } else if (opcion == 4) {
            if (num2 != 0) {
                double resultado = num1 / num2;
                System.out.println("\nEl resultado de la división es: " + resultado);
            } else {
                System.out.println("\nError: No se puede dividir entre cero.");
            }
        } else {
            System.out.println("\nError: Opción inválida. Debes ingresar un número del 1 al 4.");
        }

        scanner.close();
    }
}