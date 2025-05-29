public class SimpsonSimple {

    public static double simpson13Simple(double a, double b) {
        double m = (a + b) / 2;  // Punto medio
        return (b - a) / 6 * (f(a) + 4 * f(m) + f(b));
    }

    public static double f(double x) {
        return Math.exp(x);  // Ejemplo: f(x) = e^x
    }

    public static void main(String[] args) {
        double a = 0, b = 1;
        double resultado = simpson13Simple(a, b);
        System.out.println("Resultado (Simpson 1/3 Simple): " + resultado);
    }
}
