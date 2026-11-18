
// Importamos la herramienta para leer el teclado
import java.util.Scanner;

public class CalcularPromedio {
    public static void main(String[] args) {

        // Preparamos nuestro "lector" de teclado
        Scanner teclado = new Scanner(System.in);

        // 1. Definir variables (En Java, 'Real' se dice 'double')
        double nota1, nota2, promedio;

        // 2. Pedir datos
        System.out.println("Ingresa la primera calificación:");
        nota1 = teclado.nextDouble(); // El equivalente a 'Leer nota1'

        System.out.println("Ingresa la segunda calificación:");
        nota2 = teclado.nextDouble();

        // 3. Proceso matemático
        promedio = (nota1 + nota2) / 2.0;

        // 4. Mostrar resultado
        System.out.println("El promedio final es: " + promedio);

        // Buena práctica: cerrar el teclado al terminar
        teclado.close();
    }
}