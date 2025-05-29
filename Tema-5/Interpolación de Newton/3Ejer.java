import java.util.Scanner;

public class Newton3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de puntos: ");
        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        // Leer datos
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = sc.nextDouble();
            System.out.print("y[" + i + "]: ");
            y[i] = sc.nextDouble();
        }

        System.out.print("Ingrese el valor a interpolar: ");
        double valor = sc.nextDouble();

        double resultado = newtonInterpolacion(x, y, valor);
        System.out.println("Resultado para x = " + valor + " es: " + resultado);
        sc.close();
    }

    public static double newtonInterpolacion(double[] x, double[] y, double valor) {
        int n = x.length;
        double[][] tabla = new double[n][n];

        for (int i = 0; i < n; i++) {
            tabla[i][0] = y[i];
        }

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                tabla[i][j] = (tabla[i + 1][j - 1] - tabla[i][j - 1]) / (x[i + j] - x[i]);
            }
        }

        double resultado = tabla[0][0];
        double producto = 1;

        for (int i = 1; i < n; i++) {
            producto *= (valor - x[i - 1]);
            resultado += tabla[0][i] * producto;
        }

        return resultado;
    }
}
