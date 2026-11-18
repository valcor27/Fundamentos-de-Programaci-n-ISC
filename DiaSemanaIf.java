public class DiaSemanaIf {
    public static void main(String[] args) {
        int dia = 3;
        String nombreDia;

        if (dia == 1) {
            nombreDia = "Lunes";
        } else if (dia == 2) {
            nombreDia = "Martes";
        } else if (dia == 3) {
            nombreDia = "Miércoles";
        } else if (dia == 4) {
            nombreDia = "Jueves";
        } else if (dia == 5) {
            nombreDia = "Viernes";
        } else if (dia == 6) {
            nombreDia = "Sábado";
        } else if (dia == 7) {
            nombreDia = "Domingo";
        } else {
            nombreDia = "Día no válido";
        }

        System.out.println("El día seleccionado es: " + nombreDia);
    }
}