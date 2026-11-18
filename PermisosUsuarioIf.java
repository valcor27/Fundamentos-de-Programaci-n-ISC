public class PermisosUsuarioIf {
    public static void main(String[] args) {
        String rol = "editor";

        if (rol.equals("ADMIN")) {
            System.out.println("Acceso total: Crear, Editar y Eliminar.");
        } else if (rol.equals("EDITOR")) {
            System.out.println("Acceso medio: Crear y Editar contenido.");
        } else if (rol.equals("GUEST")) {
            System.out.println("Acceso restringido: Solo lectura.");
        } else {
            System.out.println("Rol no reconocido o acceso denegado.");
        }
    }
}