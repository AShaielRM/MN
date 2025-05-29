public class Correlacion2 {
    public static void main(String[] args) {
        double[] horas = {2, 3, 5, 7, 9};
        double[] notas = {70, 75, 85, 90, 95};

        double r = calcularCorrelacion(horas, notas);
        System.out.printf("Correlación entre horas de estudio y calificaciones: %.4f\n", r);
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
