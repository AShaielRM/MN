import java.util.Scanner;

public class GaussUsuario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Número de ecuaciones: ");
        int n = sc.nextInt();

        double[][] a = new double[n][n + 1];

        System.out.println("Ingresa la matriz aumentada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n + 1; j++) {
                a[i][j] = sc.nextDouble();
            }
        }

        gauss(a, n);
    }

    public static void gauss(double[][] a, int n) {
        for (int i = 0; i < n; i++) {
            double pivote = a[i][i];
            if (pivote == 0) {
                System.out.println("No se puede dividir entre cero.");
                return;
            }

            for (int j = 0; j < n + 1; j++) {
                a[i][j] /= pivote;
            }

            for (int k = 0; k < n; k++) {
                if (k == i) continue;
                double factor = a[k][i];
                for (int j = 0; j < n + 1; j++) {
                    a[k][j]
