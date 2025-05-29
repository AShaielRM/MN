import java.util.Arrays;

public class GaussSeidelTolerancia {
    public static void main(String[] args) {
        double[][] A = {
            {10, -1, 2},
            {-1, 11, -1},
            {2, -1, 10}
        };
        double[] b = {6, 25, -11};
        double[] x = {0, 0, 0};

        double tol = 1e-6;
        int maxIter = 100;
        int iter = 0;

        while (iter < maxIter) {
            double[] xOld = x.clone();
            for (int i = 0; i < A.length; i++) {
                double suma = 0;
                for (int j = 0; j < A.length; j++) {
                    if (j != i) suma += A[i][j] * x[j];
                }
                x[i] = (b[i] - suma) / A[i][i];
            }

            if (norma(xOld, x) < tol) break;
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
