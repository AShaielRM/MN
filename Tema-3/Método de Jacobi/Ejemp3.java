import java.util.Scanner;

public class JacobiUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Tamaño del sistema: ");
        int n = sc.nextInt();

        double[][] A = new double[n][n];
        double[] b = new double[n];
        double[] x = new double[n];
        double[] xNuevo = new double[n];

        System.out.println("Ingresa la matriz A:");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                A[i][j] = sc.nextDouble();

        System.out.println("Ingresa el vector b:");
        for (int i = 0; i < n; i++)
            b[i] = sc.nextDouble();

        System.out.println("Ingresa la tolerancia: ");
        double tol = sc.nextDouble();

        int iter = 0, maxIter = 100;

        while (iter < maxIter) {
            for (int i = 0; i < n; i++) {
                double suma = 0;
                for (int j = 0; j < n; j++) {
                    if (j != i) suma += A[i][j] * x[j];
                }
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            if (norma(x, xNuevo) < tol) break;

            x = xNuevo.clone();
            iter++;
        }

        System.out.println("Solución en " + iter + " iteraciones:");
        for (int i = 0; i < n; i++) {
            System.out.printf("x%d = %.5f\n", i + 1, x[i]);
        }
    }

    public static double norma(double[] x1, double[] x2) {
        double suma = 0;
        for (int i = 0; i < x1.length; i++) {
            suma += Math.pow(x2[i] - x1[i], 2);
        }
        return Math.sqrt(suma);
    }
}
