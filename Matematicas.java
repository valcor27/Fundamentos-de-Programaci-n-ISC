public class Matematicas {
    
    // Actúa como FUNCIÓN: le das 'a' y 'b', y te devuelve la suma.
    // No necesita saber nada más del mundo.
    public static int sumar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Se llama directamente, como usar una calculadora
        int resultado = sumar(10, 5); 
        System.out.println(resultado); // Imprime 15
    }
}