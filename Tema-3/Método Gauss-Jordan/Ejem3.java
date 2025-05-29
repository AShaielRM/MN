public class GaussJordanVerificador {
    public static void main(String[] args) {
        double[][] A = {
            {1, 2, -1, 3},
            {2, 4, -2, 6},
            {-1, -2, 1, -3}
        };

        resolverSistema(A);
    }

    public static void resolverSistema(double[][] A) {
        int n = A.length;
        int m = A[0].length;

        // Gauss-Jordan
        for (int i = 0; i < n; i++) {
            if (A[i][i] == 0) {
                boolean cambiado = false;
                for (int k = i + 1; k < n; k++) {
                    if (A[k][i] != 0) {
                        double[] temp = A[i];
                        A[i] = A[k];
                        A[k] = temp;
                        cambiado = true;
                        break;
                    }
                }
                if (!cambiado) continue;
            }

            double pivote = A[i][i];
            for (int j = 0; j < m; j++) {
                A[i][j] /= pivote;
            }

            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = A[k][i];
                    for (int j = 0; j < m; j++) {
                        A[k][j] -= factor * A[i][j];
                    }
                }
            }
        }

        // Verificar el tipo de sistema
        boolean sinSolucion = false;
        boolean infinitas = false;

        for (int i = 0; i < n; i++) {
            boolean filaCero = true;
            for (int j = 0; j < m - 1; j++) {
                if (Math.abs(A[i][j]) > 1e-9) {
                    filaCero = false;
                    break;
                }
            }
            if (filaCero && Math.abs(A[i][m - 1]) > 1e-9) {
                sinSolucion = true;
                break;
            } else if (filaCero && Math.abs(A[i][m - 1]) < 1e-9) {
                infinitas = true;
            }
        }

        if (sinSolucion) {
            System.out.println("El sistema no tiene solución (incompatible).");
        } else if (infinitas) {
            System.out.println("El sistema tiene infinitas soluciones (compatible indeterminado).");
        } else {
            System.out.println("Solución única (compatible determinado):");
            for (int i = 0; i < n; i++) {
                System.out.printf("x%d = %.4f\n", i + 1, A[i][m - 1]);
            }
        }
    }
}
