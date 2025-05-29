public class GaussSeidelBasico {
    public static void main(String[] args) {
        double[][] A = {
            {4, -1, 0},
            {-1, 4, -1},
            {0, -1, 4}
        };
        double[] b = {15, 10, 10};
        double[] x = {0, 0, 0}; // Valores iniciales

        int iteraciones = 10;

        for (int k = 0; k < iteraciones; k++) {
            for (int i = 0; i < A.length; i++) {
                double suma = 0;
                for (int j = 0; j < A.length; j++) {
                    if (j != i) suma += A[i][j] * x[j];
                }
                x[i] = (b[i] - suma) / A[i][i];
            }
        }

        System.out.println("Resultado después de " + iteraciones + " iteraciones:");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("x%d = %.5f\n", i + 1, x[i]);
        }
    }
}
