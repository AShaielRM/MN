import java.util.Scanner;

public class Lagrange3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos puntos vas a ingresar? ");
        int n = sc.nextInt();

        double[] x = new double[n];
        double[] y = new double[n];

        // Ingreso de puntos
        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "] = ");
            x[i] = sc.nextDouble();
            System.out.print("y[" + i + "] = ");
            y[i] = sc.nextDouble();
        }

        System.out.print("Ingrese el valor de x a interpolar: ");
        double valor = sc.nextDouble();

        double resultado = lagrange(x, y, valor);
        System.out.println("Resultado de la interpolación: f(" + valor + ") = " + resultado);
        sc.close();
    }

    public static double lagrange(double[] x, double[] y, double valor) {
        double resultado = 0;
        int n = x.length;

        for (int i = 0; i < n; i++) {
            double termino = y[i];
            for (int j = 0; j < n; j++) {
                if (j != i) {
                    termino *= (valor - x[j]) / (x[i] - x[j]);
                }
            }
            resultado += termino;
        }

        return resultado;
    }
}
