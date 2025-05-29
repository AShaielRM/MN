public class Simpson38Compuesto {

    public static double simpson38Compuesto(double a, double b, int n) {
        if (n % 3 != 0) {
            throw new IllegalArgumentException("n debe ser múltiplo de 3 para Simpson 3/8.");
        }

        double h = (b - a) / n;
        double suma = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            if (i % 3 == 0) {
                suma += 2 * f(xi);
            } else {
                suma += 3 * f(xi);
            }
        }

        return (3 * h / 8) * suma;
    }

    public static double f(double x) {
        return Math.log(1 + x);  // Ejemplo: f(x) = ln(1+x)
    }

    public static void main(String[] args) {
        double a = 0, b = 2;
        int n = 6;  // Debe ser múltiplo de 3
        double resultado = simpson38Compuesto(a, b, n);
        System.out.println("Resultado Simpson 3/8 Compuesto: " + resultado);
    }
}
