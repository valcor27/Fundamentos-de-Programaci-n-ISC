import java.util.Scanner;

public class LlenarArregloDinámico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿De qué tamaño requieres el arreglo?: ");
        int tamaño = scanner.nextInt();

        System.out.println("\n¿Qué tipo de datos vas a almacenar?");
        System.out.println("1. Enteros (int)");
        System.out.println("2. Decimales (double)");
        System.out.println("3. Cadenas de texto (String)");
        System.out.println("\nElige una opción (1-3): ");
        int tipo = scanner.nextInt();
        switch (tipo) {
            case 1:
                int[] arregloEnteros = new int[tamaño];
                for (int i = 0; i < tamaño; i++) {
                    System.out.print("Ingresa el valor entero para la posición " + i + ": ");
                    arregloEnteros[i] = scanner.nextInt();
                }
                break;
            case 2:
                double[] arregloDobles = new double[tamaño];
                for (int i = 0; i < tamaño; i++) {
                    System.out.print("Ingresa el valor decimal para la posición " + i + ": ");
                    arregloDobles[i] = scanner.nextDouble();
                }
                break;
            case 3:
                String[] arregloCadenas = new String[tamaño];
                scanner.nextLine(); // Limpiar el "Enter" que quedó en memoria del nextInt() anterior
                for (int i = 0; i < tamaño; i++) {
                    System.out.print("Ingresa el texto para la posición " + i + ": ");
                    arregloCadenas[i] = scanner.nextLine();
                }
                break;
            default:
                System.out.println("Opción no válida. Reinicia el programa.");
                scanner.close();
                return; // Termina el programa si la opción es incorrecta
        }
        System.out.println("\n¡El arreglo está completamente lleno!");
        scanner.close();
    }
}