public class Correlacion1 {
    public static void main(String[] args) {
        double[] x = {160, 165, 170, 175, 180};
        double[] y = {55, 60, 65, 68, 72};

        double r = calcularCorrelacion(x, y);
        System.out.println("Coeficiente de correlación: " + r);
    }

    public static double calcularCorrelacion(double[] x, double[] y) {
        int n = x.length;
        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;

        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
        }

        double numerador = n * sumXY - sumX * sumY;
        double denominador = Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY));
        return numerador / denominador;
    }
}
