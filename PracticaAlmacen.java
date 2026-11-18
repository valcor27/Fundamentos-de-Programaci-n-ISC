import java.util.Scanner;

public class PracticaAlmacen {
    public static void main(String[] args) {
        // Inicialización de variables y Scanner
        Scanner scanner = new Scanner(System.in);
        // Arreglo bidimensional de 5x5 (por defecto en Java se inicializa en 0)
        int[][] almacen = new int[5][5];
        int opcion = -1;
        int fila, columna, idPaquete;

        System.out.println("--- Sistema de Gestión de Almacén Alpha ---");

        // Ciclo principal del menú interactivo
        while (opcion != 0) {
            System.out.println("\nMenú de Opciones:");
            System.out.println("1. Agregar paquete");
            System.out.println("2. Eliminar paquete");
            System.out.println("3. Visualizar almacén");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la fila (0-4): ");
                    fila = scanner.nextInt();
                    System.out.print("Ingrese la columna (0-4): ");
                    columna = scanner.nextInt();

                    // Validación de límites para evitar desbordamientos
                    if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
                        if (almacen[fila][columna] == 0) {
                            System.out.print("Ingrese el número de ID del paquete: ");
                            idPaquete = scanner.nextInt();
                            almacen[fila][columna] = idPaquete;
                            System.out.println("¡Paquete almacenado correctamente!");
                        } else {
                            System.out.println(
                                    "Error: El espacio ya está ocupado por el paquete ID: " + almacen[fila][columna]);
                        }
                    } else {
                        System.out.println("Error: Las coordenadas ingresadas están fuera de los límites del almacén.");
                    }
                    break;

                case 2:
                    System.out.print("Ingrese la fila (0-4): ");
                    fila = scanner.nextInt();
                    System.out.print("Ingrese la columna (0-4): ");
                    columna = scanner.nextInt();

                    // Validación de límites para evitar desbordamientos
                    if (fila >= 0 && fila < 5 && columna >= 0 && columna < 5) {
                        if (almacen[fila][columna] != 0) {
                            almacen[fila][columna] = 0; // Eliminación lógica reasignando un 0
                            System.out.println("Paquete retirado. Espacio liberado correctamente.");
                        } else {
                            System.out.println("Aviso: El espacio seleccionado ya se encontraba vacío.");
                        }
                    } else {
                        System.out.println("Error: Las coordenadas ingresadas están fuera de los límites del almacén.");
                    }
                    break;

                case 3:
                    System.out.println("\nEstado actual del almacén (0 = Espacio vacío):");
                    // Ciclos for anidados para imprimir la cuadrícula
                    for (int i = 0; i < 5; i++) {
                        for (int j = 0; j < 5; j++) {
                            System.out.print(almacen[i][j] + "\t");
                        }
                        System.out.println(); // Salto de línea para formar la estructura de filas
                    }
                    break;

                case 0:
                    System.out.println("Cerrando el sistema. ¡Hasta luego!");
                    break;

                default:
                    System.out.println("Error: Opción inválida. Por favor, seleccione un número del menú.");
                    break;
            }
        }

        scanner.close();
    }
}