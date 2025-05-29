public class MinimosCuadrados3 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3, 4};
        double[] y = {100, 120, 130, 150};
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

        System.out.println("Función de ventas: y = " + a + "x + " + b);

        double xNuevo = 5;
        double yEstimada = a * xNuevo + b;
        System.out.println("Ventas estimadas para año 5: " + yEstimada + " unidades");
    }
}
