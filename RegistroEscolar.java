import java.util.ArrayList;
import java.util.Scanner; // Importamos Scanner para leer el teclado


// 2. EL CONTROLADOR (Modificamos el main para hacerlo interactivo)
public class RegistroEscolar {

    static ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        do {
            System.out.println("\n=== MENÚ ESCOLAR ===");
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine(); // ⚠️ TRUCO PARA ALUMNOS: Limpiar el "Enter" que sobra tras leer un número

            switch (opcion) {
                case 1:
                    // Pedimos los datos al usuario
                    System.out.print("Ingresa la matrícula: ");
                    String mat = teclado.nextLine();

                    System.out.print("Ingresa el nombre: ");
                    String nom = teclado.nextLine();

                    System.out.print("Ingresa el apellido paterno: ");
                    String apPat = teclado.nextLine();

                    System.out.print("Ingresa el apellido materno: ");
                    String apMat = teclado.nextLine();

                    // Enviamos los datos tecleados a nuestra función
                    registrarEstudiante(mat, nom, apPat, apMat);
                    break;

                case 2:
                    mostrarTodosLosEstudiantes();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        teclado.close(); // Buena práctica: cerrar el scanner al terminar
    }

    // --- LAS FUNCIONES SE QUEDAN INTACTAS ---

    static void registrarEstudiante(String mat, String nom, String apPat, String apMat) {
        Estudiante nuevoAlumno = new Estudiante(mat, nom, apPat, apMat);
        listaEstudiantes.add(nuevoAlumno);
        System.out.println("Estudiante " + nom + " registrado con éxito.");
    }

    static void mostrarTodosLosEstudiantes() {
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        if (listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados aún.");
            return;
        }

        for (Estudiante alumno : listaEstudiantes) {
            System.out.println(alumno.obtenerFichaBreve());
        }
        System.out.println("----------------------------");
    }
}