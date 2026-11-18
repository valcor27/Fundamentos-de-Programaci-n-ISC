import java.util.Scanner;
import java.util.ArrayList; // Importación nueva

public class BaseDeDatosDinamica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // AQUÍ ESTÁ LA MAGIA: Una lista dinámica donde cada elemento es un arreglo de 3
        // posiciones
        ArrayList<String[]> tabla = new ArrayList<>();
        int opcion = 0;

        while (opcion != 4) {
            System.out.println("\n=== SISTEMA DE REGISTROS DINÁMICO ===");
            System.out.println("1. Nuevo registro");
            System.out.println("2. Ver tabla completa");
            System.out.println("3. Buscar por nombre");
            System.out.println("4. Salir");
            System.out.print("Selecciona una opción: ");
            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {
                case 1:
                    // Ya no hay límite. Creamos un arreglo temporal para el nuevo usuario.
                    String[] nuevoRegistro = new String[3];

                    System.out.print("ID: ");
                    nuevoRegistro[0] = sc.nextLine();

                    System.out.print("Nombre completo: ");
                    nuevoRegistro[1] = sc.nextLine();

                    System.out.print("Teléfono: ");
                    nuevoRegistro[2] = sc.nextLine();

                    // Agregamos el arreglo a la lista dinámica
                    tabla.add(nuevoRegistro);
                    System.out.println("Registro guardado con éxito. Total de registros: " + tabla.size());
                    break;

                case 2:
                    if (tabla.isEmpty()) { // Verificamos si la lista está vacía
                        System.out.println("No hay registros almacenados.");
                    } else {
                        System.out.println("\n--------------------------------------------------------------");
                        System.out.printf("%-8s | %-32s | %-15s%n", "ID", "NOMBRE COMPLETO", "TELÉFONO");
                        System.out.println("--------------------------------------------------------------");

                        // Recorremos hasta tabla.size()
                        for (int i = 0; i < tabla.size(); i++) {
                            // Extraemos la fila actual para poder imprimir sus columnas
                            String[] filaActual = tabla.get(i);
                            System.out.printf("%-8s | %-32s | %-15s%n",
                                    filaActual[0], filaActual[1], filaActual[2]);
                        }
                        System.out.println("--------------------------------------------------------------");
                    }
                    break;

                case 3:
                    System.out.print("Ingresa el nombre o apellido a buscar: ");
                    String busqueda = sc.nextLine().toLowerCase();
                    boolean encontrado = false;

                    for (int i = 0; i < tabla.size(); i++) {
                        String[] filaActual = tabla.get(i);

                        // Buscamos coincidencias en la columna 1
                        if (filaActual[1].toLowerCase().contains(busqueda)) {
                            System.out.println("Registro encontrado -> ID: " + filaActual[0] +
                                    " | Nombre: " + filaActual[1] +
                                    " | Teléfono: " + filaActual[2]);
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
        }

        sc.close();
    }
}