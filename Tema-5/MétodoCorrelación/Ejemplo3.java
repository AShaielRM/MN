import java.util.Scanner;

public class Correlacion3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Cuántos pares de datos vas a ingresar? ");
        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextDouble();
            System.out.print("y[" + i + "]: ");
            y[i] = sc.nextDouble();
        }

        double r = calcularCorrelacion(x, y);
        System.out.printf("Coeficiente de correlación r = %.5f\n", r);
        sc.close();
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
