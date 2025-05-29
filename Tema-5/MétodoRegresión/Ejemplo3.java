import java.util.Scanner;

public class Regresion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de datos: ");
        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextDouble();
            System.out.print("y[" + i + "]: ");
            y[i] = sc.nextDouble();
        }

        double[] r = calcularRegresion(x, y);
        System.out.printf("Modelo ajustado: y = %.4f + %.4fx\n", r[0], r[1]);

        System.out.print("Introduce valor de x para predecir y: ");
        double valorX = sc.nextDouble();
        System.out.printf("Predicción: y = %.4f\n", r[0] + r[1] * valorX);
        sc.close();
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
