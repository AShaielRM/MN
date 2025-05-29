public class Lagrange1 {
    public static void main(String[] args) {
        double[] x = {1, 2, 3};
        double[] y = {2, 3, 5};
        double valor = 2.5;

        double resultado = lagrange(x, y, valor);
        System.out.println("Interpolación de Lagrange en x = " + valor + ": " + resultado);
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
