import java.util.Scanner; // Importamos la librería para capturar datos

public class CineInteractivo {
    public static void main(String[] args) {
        // Creamos el objeto Scanner para leer la consola
        Scanner leer = new Scanner(System.in);
        String pelicula;
        // 1. Pedir datos al usuario
        System.out.print("Ingrese el nombre de la película: ");
        pelicula = leer.nextLine();

        System.out.print("Ingrese la cantidad de boletos: ");
        int cantidadBoletos = leer.nextInt();

        System.out.print("Ingrese el precio del boleto: ");
        double precioBoleto = leer.nextDouble();

        // 2. Proceso / Cálculo
        double total = cantidadBoletos * precioBoleto;

        // 3. Salida de datos
        System.out.println("\n--- TICKET DE COMPRA ---");
        System.out.println("Película: " + pelicula);
        System.out.println("Boletos: " + cantidadBoletos);
        System.out.println("Total a pagar: $" + total);

        leer.close(); // Buena práctica: cerrar el scanner
    }
}