public class EjemploFor {
    public static void main(String[] args) {
        int totalProductos = 5;

        // Sabes exactamente cuándo empieza (1) y cuándo termina (5)
        for (int i = 1; i <= totalProductos; i++) {
            System.out.println("Escaneando producto #" + i + "... ¡Beep!");
        }

        System.out.println("Todos los productos fueron escaneados. Proceder al pago.");
    }
}