public class GaussJordanBasico {
    public static void main(String[] args) {
        double[][] A = {
            {2, 1, -1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        gaussJordan(A);
    }

    public static void gaussJordan(double[][] matriz) {
        int n = matriz.length;

        for (int i = 0; i < n; i++) {
            // Hacer el pivote igual a 1
            double pivote = matriz[i][i];
            for (int j = 0; j <= n; j++) {
                matriz[i][j] /= pivote;
            }

            // Hacer 0 en la columna actual, excepto el pivote
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = matriz[k][i];
                    for (int j = 0; j <= n; j++) {
                        matriz[k][j] -= factor * matriz[i][j];
                    }
                }
            }
        }

        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.2f\n", i + 1, matriz[i][n]);
        }
    }
}
