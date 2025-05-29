public class GaussSimple {
    public static void main(String[] args) {
        double[][] matriz = {
            {2, -1, 1, 8},
            {-3, -1, 2, -11},
            {-2, 1, 2, -3}
        };

        gauss(matriz);
    }

    public static void gauss(double[][] a) {
        int n = a.length;

        // Eliminación hacia adelante
        for (int i = 0; i < n; i++) {
            // Pivote
            double pivote = a[i][i];
            for (int j = 0; j < n + 1; j++) {
                a[i][j] /= pivote;
            }

            // Eliminar hacia abajo
            for (int k = i + 1; k < n; k++) {
                double factor = a[k][i];
                for (int j = 0; j < n + 1; j++) {
                    a[k][j] -= factor * a[i][j];
                }
            }
        }

        // Sustitución hacia atrás
        double[] x = new double[n];
        for (int i = n - 1; i >= 0; i--) {
            x[i] = a[i][n];
            for (int j = i + 1; j < n; j++) {
                x[i] -= a[i][j] * x[j];
            }
        }

        System.out.println("Soluciones:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.2f\n", i + 1, x[i]);
        }
    }
}
