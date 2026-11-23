import java.util.ArrayList;
import java.util.Scanner;

public class RegistroEscolar {

    private ArrayList<Estudiante> listaEstudiantes;

    public RegistroEscolar() {
        this.listaEstudiantes = new ArrayList<>();
    }

    public static void main(String[] args) {
        RegistroEscolar sistema = new RegistroEscolar();
        Scanner teclado = new Scanner(System.in);
        int opcion = 0;

        // Ciclo while para el menú
        while (opcion != 3) {
            System.out.println("\n=== MENÚ ESCOLAR ===");
            System.out.println("1. Registrar nuevo estudiante");
            System.out.println("2. Mostrar todos los estudiantes");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");

            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Ingresa la matrícula: ");
                    String mat = teclado.nextLine();

                    System.out.print("Ingresa el nombre: ");
                    String nom = teclado.nextLine();

                    System.out.print("Ingresa el apellido paterno: ");
                    String apPat = teclado.nextLine();

                    System.out.print("Ingresa el apellido materno: ");
                    String apMat = teclado.nextLine();

                    sistema.registrarEstudiante(mat, nom, apPat, apMat);
                    break;

                case 2:
                    sistema.mostrarTodosLosEstudiantes();
                    break;

                case 3:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        }

        teclado.close();
    }

    // Métodos de instancia de RegistroEscolar
    public void registrarEstudiante(String mat, String nom, String apPat, String apMat) {
        Estudiante nuevoAlumno = new Estudiante(mat, nom, apPat, apMat);
        this.listaEstudiantes.add(nuevoAlumno);
        System.out.println("Estudiante " + nom + " registrado con éxito.");
    }

    public void mostrarTodosLosEstudiantes() {
        System.out.println("\n--- LISTA DE ESTUDIANTES ---");
        if (this.listaEstudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados aún.");
            return;
        }

        for (Estudiante alumno : this.listaEstudiantes) {
            // Llamamos al método de instancia del objeto Estudiante
            System.out.println(alumno.obtenerFichaBreve());
        }
        System.out.println("----------------------------");
    }
}