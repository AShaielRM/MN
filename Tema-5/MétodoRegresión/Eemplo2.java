public class Regresion2 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2.5, 4.7, 6.1, 8.0, 10.1};

        double[] r = calcularRegresion(x, y);
        System.out.printf("Modelo de ventas: y = %.4f + %.4fx\n", r[0], r[1]);
        System.out.printf("Predicción para inversión de 3.5: %.4f\n", r[0] + r[1] * 3.5);
    }

    public static double[] calcularRegresion(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double b = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double a = (sumY - b * sumX) / n;

        return new double[]{a, b};
    }
}
