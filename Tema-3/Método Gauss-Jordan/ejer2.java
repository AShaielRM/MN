import java.util.Scanner;

public class GaussJordanUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de incógnitas: ");
        int n = sc.nextInt();

        double[][] matriz = new double[n][n + 1];

        System.out.println("Ingresa la matriz aumentada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= n; j++) {
                matriz[i][j] = sc.nextDouble();
            }
        }

        gaussJordan(matriz);
    }

    public static void gaussJordan(double[][] A) {
        int n = A.length;

        for (int i = 0; i < n; i++) {
            // Pivote a 1
            double pivote = A[i][i];
            if (pivote == 0) {
                System.out.println("Error: división por cero.");
                return;
            }

            for (int j = 0; j <= n; j++) {
                A[i][j] /= pivote;
            }

            // Hacer ceros en la columna
            for (int k = 0; k < n; k++) {
                if (k != i) {
                    double factor = A[k][i];
                    for (int j = 0; j <= n; j++) {
                        A[k][j] -= factor * A[i][j];
                    }
                }
            }
        }

        System.out.println("Solución:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.4f\n", i + 1, A[i][n]);
        }
    }
}
