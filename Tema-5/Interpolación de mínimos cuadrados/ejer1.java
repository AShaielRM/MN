public class MinimosCuadrados1 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4, 5};
        double[] y = {2, 4, 5, 4, 5};
        int n = x.length;

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0;

        // Sumar datos
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
        }

        // Calcular coeficientes
        double a = (n * sumXY - sumX * sumY) / (n * sumX2 - sumX * sumX);
        double b = (sumY - a * sumX) / n;

        System.out.println("Recta ajustada: y = " + a + "x + " + b);

        // Estimar y cuando x = 6
        double xNuevo = 6;
        double yEstimada = a * xNuevo + b;
        System.out.println("Para x = " + xNuevo + ", y ≈ " + yEstimada);
    }
}
