public class EjemploMatriz {
    public static void main(String[] args) {
        // 1. Declarar e inicializar una matriz de 3 filas y 3 columnas
        int[][] matriz = new int[3][3];

        int contador = 1;

        // 2. Llenar la matriz usando bucles anidados
        // El primer bucle (i) recorre las filas
        for (int i = 0; i < matriz.length; i++) {
            // El segundo bucle (j) recorre las columnas
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = contador;
                contador++;
            }
        }

        System.out.println("Contenido de la matriz:");

        // 3. Imprimir la matriz en formato de tabla
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // Usamos print en lugar de println para mantener los números en la misma línea
                System.out.print(matriz[i][j] + "\t");
            }
            // Hacemos un salto de línea al terminar cada fila
            System.out.println();
        }
    }
}