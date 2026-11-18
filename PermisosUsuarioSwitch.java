import java.util.*;
public class PermisosUsuarioSwitch {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("\n--- Menú de Opciones ---");
        System.out.println("ADMIN");
        System.out.println("EDITOR");
        System.out.println("GUEST");

        System.out.println("Ingresa el valor de tu nivel");

        String rol = leer.nextLine().toUpperCase();
        //rol = rol.toUpperCase();
        //String rol_masyusculas = rol.toUpperCase();
        //toUpperCase(): Convierte toda la cadena de caracteres a mayúsculas.
        //toLowerCase(): Convierte toda la cadena de caracteres a minúsculas

        //String rol_mayusculas = rol.toUpperCase();

        switch (rol) {
            case "ADMIN":
                System.out.println("Acceso total: Crear, Editar y Eliminar.");
                break;
            case "EDITOR":
                System.out.println("Acceso medio: Crear y Editar contenido.");
                break;
            case "GUEST":
                System.out.println("Acceso restringido: Solo lectura.");
                break;
            default:
                System.out.println("Rol no reconocido o acceso denegado.");
                break;
        }
        leer.close();
    }
}