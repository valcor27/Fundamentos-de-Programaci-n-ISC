public class EjemploWhile {
    public static void main(String[] args) {
        int bateria = 40; // Porcentaje inicial de carga

        // Mientras no esté llena, sigue cargando
        while (bateria < 100) {
            System.out.println("Cargando... Batería actual: " + bateria + "%");
            //bateria = bateria + 20;
            bateria += 20; // Simula la energía recibida en un lapso de tiempo
        }

        System.out.println("¡Carga completa! 100%. Puedes desconectar el teléfono.");
    }
}