public class Newton2 {
    public static void main(String[] args) {
        double[] x = {100, 150, 200};
        double[] y = {25.2, 35.5, 50.1};
        double valor = 175;

        double resultado = newtonInterpolacion(x, y, valor);
        System.out.println("Presión estimada para x = " + valor + ": " + resultado);
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
