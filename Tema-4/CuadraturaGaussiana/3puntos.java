public class Gauss3Puntos {

    public static double gauss3(double a, double b) {
        double[] x = {-0.7745966692, 0.0, 0.7745966692};
        double[] w = {0.5555555556, 0.8888888889, 0.5555555556};

        double resultado = 0.0;
        for (int i = 0; i < 3; i++) {
            double xi = ((b - a) / 2) * x[i] + (a + b) / 2;
            resultado += w[i] * f(xi);
        }

        return ((b - a) / 2) * resultado;
    }

    public static double f(double x) {
        return Math.sin(x);  // Ejemplo: f(x) = sin(x)
    }

    public static void main(String[] args) {
        double a = 0, b = Math.PI;
        System.out.println("Resultado (3 puntos): " + gauss3(a, b));
    }
}
