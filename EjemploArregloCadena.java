public class EjemploArregloCadena {
    public static void main(String[] args) {

        String[] nombres = { "Joan", "Michael", "Valle", "Santiago" };

        System.out.println("El segundo nombre es: " + nombres[1]);

        nombres[1] = "09";

        for (int i = 0; i < nombres.length; i++) {
            System.out.println("Posición " + i + ": " + nombres[i]);
        }
    }
}