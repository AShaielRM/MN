public class TrapecioCompuesto {

    public static double trapecioCompuesto(double a, double b, int n) {
        double h = (b - a) / n;
        double suma = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            suma += 2 * f(xi);
        }

        return (h / 2) * suma;
    }

    public static double f(double x) {
        return Math.sin(x);  // Ejemplo: f(x) = sin(x)
    }

    public static void main(String[] args) {
        double a = 0, b = Math.PI;
        int n = 10;  // Número de subintervalos
        double resultado = trapecioCompuesto(a, b, n);
        System.out.println("Resultado (Trapecio Compuesto): " + resultado);
    }
}
