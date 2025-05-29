public class Simpson38Simple {

    public static double simpson38Simple(double a, double b) {
        double h = (b - a) / 3;
        double x0 = a;
        double x1 = a + h;
        double x2 = a + 2 * h;
        double x3 = b;

        return (3 * h / 8) * (f(x0) + 3 * f(x1) + 3 * f(x2) + f(x3));
    }

    public static double f(double x) {
        return Math.sin(x);  // Ejemplo: f(x) = sin(x)
    }

    public static void main(String[] args) {
        double a = 0, b = Math.PI;
        double resultado = simpson38Simple(a, b);
        System.out.println("Resultado Simpson 3/8 Simple: " + resultado);
    }
}
