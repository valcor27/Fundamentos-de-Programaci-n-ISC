import java.util.Scanner;

public class BaseDeDatosMatriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Matriz de 5 filas (capacidad de registros) x 3 columnas (campos)
        int maxRegistros = 5;
        String[][] tabla = new String[maxRegistros][3];
        int totalRegistrados = 0; // Controla en qué fila vacía vamos a escribir
        int opcion = 0; // Inicializado en 0 para que la condición del while se cumpla al iniciar

        while (opcion != 4) {
            System.out.println("\n=== SISTEMA DE REGISTROS ===");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Ver tabla completa");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpia el salto de línea pendiente antes de leer texto

            switch (opcion) {
                case 1:
                    if (totalRegistrados < maxRegistros) {
                        System.out.print("ID: ");
                        tabla[totalRegistrados][0] = sc.nextLine();

                        System.out.print("Nombre completo: ");
                        tabla[totalRegistrados][1] = sc.nextLine();

                        System.out.print("Teléfono: ");
                        tabla[totalRegistrados][2] = sc.nextLine();

                        totalRegistrados++; // Avanzamos a la siguiente fila para el próximo registro
                        System.out.println("Registro guardado con éxito.");
                    } else {
                        System.out.println("La tabla está llena (máximo " + maxRegistros + " registros).");
                    }
                    break;

                case 2:
                    if (totalRegistrados == 0) {
                        System.out.println("No hay registros almacenados.");
                    } else {
                        /*
                         * - ANATOMÍA DE %-32s (Formato de columnas con printf):
                         * - - % (Porcentaje): Le indica a Java que ahí empieza un comodín que será
                         * - reemplazado por un dato real (los que pones después de la coma).
                         * - - - (Guion): Alinea el texto hacia la izquierda.
                         * - - 32 (Número): Es el ancho mínimo de la columna en caracteres.
                         * - - s (Letra s): Indica que el tipo de dato que se va a insertar es un texto
                         * (String).
                         * - - %n : Genera un salto de línea compatible con cualquier sistema operativo.
                         */
                        System.out.println("\n--------------------------------------------------------------");
                        System.out.printf("%-8s | %-32s | %-15s%n", "ID", "NOMBRE COMPLETO", "TELÉFONO");
                        System.out.println("--------------------------------------------------------------");

                        // Recorremos solo hasta 'totalRegistrados' para no imprimir filas nulas (null)
                        for (int i = 0; i < totalRegistrados; i++) {
                            System.out.printf("%-8s | %-32s | %-15s%n",
                                    tabla[i][0], tabla[i][1], tabla[i][2]);
                        }
                        System.out.println("--------------------------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el nombre o apellido a buscar: ");
                    String busqueda = sc.nextLine().toLowerCase();
                    boolean encontrado = false;

                    for (int i = 0; i < totalRegistrados; i++) {
                        // Buscamos coincidencias en la columna 1 (Nombre Completo)
                        if (tabla[i][1].toLowerCase().contains(busqueda)) {
                            System.out.println("Registro encontrado -> ID: " + tabla[i][0] +
                                    " | Nombre: " + tabla[i][1] +
                                    " | Teléfono: " + tabla[i][2]);
                            encontrado = true;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("No se encontraron registros con ese nombre.");
                    }
                    break;

                case 4:
                    System.out.println("Cerrando programa...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }
        } // Fin del while

        sc.close();
    }
}