public class Newton1 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3};
        double[] y = {2, 3, 12};
        double valor = 2.5;

        double resultado = newtonInterpolacion(x, y, valor);
        System.out.println("Interpolación de Newton en x = " + valor + ": " + resultado);
    }

    public static double newtonInterpolacion(double[] x, double[] y, double valor) {
        int n = x.length;
        double[][] tabla = new double[n][n];

        // Copiar valores y en primera columna
        for (int i = 0; i < n; i++) {
            tabla[i][0] = y[i];
        }

        // Calcular diferencias divididas
        for (int j = 1; j < n; j++) {
            for (int i = 0; i < n - j; i++) {
                tabla[i][j] = (tabla[i + 1][j - 1] - tabla[i][j - 1]) / (x[i + j] - x[i]);
            }
        }

        // Evaluar el polinomio en el valor deseado
        double resultado = tabla[0][0];
        double producto = 1;

        for (int i = 1; i < n; i++) {
            producto *= (valor - x[i - 1]);
            resultado += tabla[0][i] * producto;
        }

        return resultado;
    }
}
