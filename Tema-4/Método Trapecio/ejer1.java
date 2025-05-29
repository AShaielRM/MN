public class TrapecioSimple {

    public static double trapecioSimple(double a, double b) {
        double fa = f(a);
        double fb = f(b);
        return ((b - a) / 2) * (fa + fb);
    }

    public static double f(double x) {
        return Math.pow(x, 2);  // Ejemplo: f(x) = x^2
    }

    public static void main(String[] args) {
        double a = 0, b = 2;
        double resultado = trapecioSimple(a, b);
        System.out.println("Resultado (Trapecio Simple): " + resultado);
    }
}
