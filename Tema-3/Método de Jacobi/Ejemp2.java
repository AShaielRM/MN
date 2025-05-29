import java.util.Arrays;

public class JacobiTolerancia {
    public static void main(String[] args) {
        double[][] A = {
            {4, 1, 2},
            {3, 5, 1},
            {1, 1, 3}
        };
        double[] b = {4, 7, 3};
        double[] x = {0, 0, 0};
        double[] xNuevo = new double[3];
        double tol = 1e-6;
        int maxIter = 100;
        int iter = 0;

        while (iter < maxIter) {
            for (int i = 0; i < 3; i++) {
                double suma = 0;
                for (int j = 0; j < 3; j++) {
                    if (i != j) suma += A[i][j] * x[j];
                }
                xNuevo[i] = (b[i] - suma) / A[i][i];
            }

            if (norma(x, xNuevo) < tol) break;

            x = xNuevo.clone();
            iter++;
        }

        System.out.println("Resultado en " + iter + " iteraciones:");
        System.out.println(Arrays.toString(x));
    }

    public static double norma(double[] x1, double[] x2) {
        double suma = 0;
        for (int i = 0; i < x1.length; i++) {
            suma += Math.pow(x2[i] - x1[i], 2);
        }
        return Math.sqrt(suma);
    }
}
