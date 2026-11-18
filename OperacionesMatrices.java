public class OperacionesMatrices {
    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int sumaTotal = 0;
        int sumaDiagonal = 0;
        int[][] transpuesta = new int[3][3];

        // Recorrido secuencial mediante ciclos anidados
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                // 1. Acumulación total
                sumaTotal += matriz[i][j];

                // 2. Suma de diagonal principal
                if (i == j) {
                    sumaDiagonal += matriz[i][j];
                }

                // 3. Cálculo de la matriz transpuesta
                transpuesta[j][i] = matriz[i][j];
            }
        }

        System.out.println("Suma total: " + sumaTotal);
        System.out.println("Suma diagonal principal: " + sumaDiagonal);

        System.out.println("Matriz transpuesta:");
        for (int i = 0; i < transpuesta.length; i++) {
            for (int j = 0; j < transpuesta[i].length; j++) {
                System.out.print(transpuesta[i][j] + " ");
            }
            System.out.println();
        }
    }
}