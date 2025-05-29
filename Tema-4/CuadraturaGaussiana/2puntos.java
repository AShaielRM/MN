public class Gauss2Puntos {

    public static double gauss2(double a, double b) {
        // Puntos y pesos para 2 puntos
        double[] x = {-0.5773502692, 0.5773502692};
        double[] w = {1.0, 1.0};

        double resultado = 0.0;
        for (int i = 0; i < 2; i++) {
            double xi = ((b - a) / 2) * x[i] + (a + b) / 2;
            resultado += w[i] * f(xi);
        }

        return ((b - a) / 2) * resultado;
    }

    public static double f(double x) {
        return Math.exp(x);  // Ejemplo: f(x) = e^x
    }

    public static void main(String[] args) {
        double a = 0, b = 1;
        System.out.println("Resultado (2 puntos): " + gauss2(a, b));
    }
}
