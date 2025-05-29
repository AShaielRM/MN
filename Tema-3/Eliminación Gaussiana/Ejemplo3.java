public class GaussVerificacion {
    public static void main(String[] args) {
        double[][] a = {
            {1, -2, 1, 0},
            {3, -6, 3, 0},
            {2, -4, 2, 0}
        };

        resolverSistema(a);
    }

    public static void resolverSistema(double[][] a) {
        int n = a.length;

        // Eliminación
        for (int i = 0; i < n; i++) {
            if (a[i][i] == 0) {
                boolean intercambiado = false;
                for (int k = i + 1; k < n; k++) {
                    if (a[k][i] != 0) {
                        double[] temp = a[i];
                        a[i] = a[k];
                        a[k] = temp;
                        intercambiado = true;
                        break;
                    }
                }
                if (!intercambiado) continue;
            }

            double pivote = a[i][i];
            for (int j = 0; j < n + 1; j++) {
                a[i][j] /= pivote;
            }

            for (int k = i + 1; k < n; k++) {
                double factor = a[k][i];
                for (int j = 0; j < n + 1; j++) {
                    a[k][j] -= factor * a[i][j];
                }
            }
        }

        // Verificación
        boolean inconsistente = false;
        boolean infinitas = false;

        for (int i = 0; i < n; i++) {
            boolean todoCero = true;
            for (int j = 0; j < n; j++) {
                if (Math.abs(a[i][j]) > 1e-9) {
                    todoCero = false;
                    break;
                }
            }
            if (todoCero && Math.abs(a[i][n]) > 1e-9) {
                inconsistente = true;
                break;
            } else if (todoCero && Math.abs(a[i][n]) <= 1e-9) {
                infinitas = true;
            }
        }

        if (inconsistente) {
            System.out.println("El sistema no tiene solución.");
        } else if (infinitas) {
            System.out.println("El sistema tiene infinitas soluciones.");
        } else {
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
}
