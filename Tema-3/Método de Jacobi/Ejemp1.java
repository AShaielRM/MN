public class JacobiFijo {
    public static void main(String[] args) {
        double[][] A = {
            {10, -1, 2},
            {-1, 11, -1},
            {2, -1, 10}
        };
        double[] b = {6, 25, -11};
        double[] x = {0, 0, 0}; // Valores iniciales

        int iteraciones = 10;

        for (int k = 0; k < iteraciones; k++) {
            double[] xNuevo = new double[3];

            xNuevo[0] = (b[0] - A[0][1] * x[1] - A[0][2] * x[2]) / A[0][0];
            xNuevo[1] = (b[1] - A[1][0] * x[0] - A[1][2] * x[2]) / A[1][1];
            xNuevo[2] = (b[2] - A[2][0] * x[0] - A[2][1] * x[1]) / A[2][2];

            x = xNuevo.clone();
        }

        System.out.println("Resultado aproximado después de 10 iteraciones:");
        for (int i = 0; i < x.length; i++) {
            System.out.printf("x%d = %.5f\n", i + 1, x[i]);
        }
    }
}
