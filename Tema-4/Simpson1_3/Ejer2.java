public class SimpsonCompuesto {

    public static double simpson13Compuesto(double a, double b, int n) {
        if (n % 2 != 0) {
            throw new IllegalArgumentException("n debe ser par para Simpson 1/3.");
        }

        double h = (b - a) / n;
        double suma = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            if (i % 2 == 0) {
                suma += 2 * f(xi);
            } else {
                suma += 4 * f(xi);
            }
        }

        return (h / 3) * suma;
    }

    public static double f(double x) {
        return 1 / (1 + x * x);  // Ejemplo: f(x) = 1 / (1 + x^2)
    }

    public static void main(String[] args) {
        double a = 0, b = 1;
        int n = 10;  // Debe ser par
        double resultado = simpson13Compuesto(a, b, n);
        System.out.println("Resultado (Simpson 1/3 Compuesto): " + resultado);
    }
}
