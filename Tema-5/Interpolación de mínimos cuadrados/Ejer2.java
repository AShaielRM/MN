public class MinimosCuadrados2 {
    public static void main(String[] args) {
        double[] x = {0.5, 1.0, 1.5, 2.0, 2.5};
        double[] y = {1.1, 2.0, 2.9, 3.9, 4.8};
        int n = x.length;

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        double a = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double b = (sumY - a * sumX) / n;

        System.out.println("Relación: y = " + a + "x + " + b);

        double xNuevo = 3.0;
        double yEstimada = a * xNuevo + b;
        System.out.println("Elongación para 3.0 kg ≈ " + yEstimada + " cm");
    }
}
