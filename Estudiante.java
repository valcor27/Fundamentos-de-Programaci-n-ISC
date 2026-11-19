public class Estudiante {
    String matricula;
    String nombre;
    String apellidoPaterno;
    String apellidoMaterno;

    // Método constructor
    public Estudiante(String matricula, String nombre, String apellidoPaterno, String apellidoMaterno) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
    }

    // Método de instancia (opcional para la tabla, pero útil si se quiere imprimir
    // en consola)
    public String obtenerFichaBreve() {
        return matricula + " | " + nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }
}