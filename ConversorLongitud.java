import java.util.Scanner;

public class ConversorLongitud {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de datos
        System.out.print("Ingresa la cantidad en metros: ");
        double metros = scanner.nextDouble();

        // Validación de valor negativo
        if (metros < 0) {
            System.out.println("\nError: La distancia no puede ser negativa.");
        } else {
            // Menú de opciones
            System.out.println("\n--- Menú de Conversiones ---");
            System.out.println("1. Convertir a Kilómetros");
            System.out.println("2. Convertir a Centímetros");
            System.out.println("3. Convertir a Millas");
            System.out.println("4. Convertir a Pies");

            System.out.print("Elige una opción (1, 2, 3 o 4): ");
            int opcion = scanner.nextInt();

            // Estructura condicional
            if (opcion == 1) {
                double resultado = metros / 1000;
                System.out.println("\n" + metros + " metros equivalen a: " + resultado + " km");
            } else if (opcion == 2) {
                double resultado = metros * 100;
                System.out.println("\n" + metros + " metros equivalen a: " + resultado + " cm");
            } else if (opcion == 3) {
                double resultado = metros / 1609.34;
                System.out.println("\n" + metros + " metros equivalen a: " + resultado + " millas");
            } else if (opcion == 4) {
                double resultado = metros * 3.28084;
                System.out.println("\n" + metros + " metros equivalen a: " + resultado + " pies");
            } else {
                System.out.println("\nError: Opción inválida. Debes ingresar un número del 1 al 4.");
            }
        }

        scanner.close();
    }
}