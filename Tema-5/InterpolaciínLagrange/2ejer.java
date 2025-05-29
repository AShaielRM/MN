public class Lagrange2 {
    public static void main(String[] args) {
        double[] x = {1, 3, 4};
        double[] y = {15, 20, 25};
        double hora = 2;

        double tempEstimada = lagrange(x, y, hora);
        System.out.println("Temperatura estimada a la hora " + hora + ": " + tempEstimada + " °C");
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
