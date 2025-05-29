public class Regresion1 {
    public static void main(String[] args) {
        double[] x = {150, 160, 170, 180, 190};
        double[] y = {50, 55, 65, 70, 80};

        double[] resultado = calcularRegresion(x, y);
        double a = resultado[0];
        double b = resultado[1];

        System.out.println("Modelo: y = " + a + " + " + b + "x");
        System.out.println("Predicción para x = 175: " + (a + b * 175));
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
