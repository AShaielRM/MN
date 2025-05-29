import java.util.Scanner;

public class TrapecioInteractivo {

    public static double trapecio(double a, double b, int n) {
        double h = (b - a) / n;
        double suma = f(a) + f(b);

        for (int i = 1; i < n; i++) {
            double xi = a + i * h;
            suma += 2 * f(xi);
        }

        return (h / 2) * suma;
    }

    public static double f(double x) {
        return Math.log(1 + x);  // Ejemplo: f(x) = ln(1 + x)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el valor de a: ");
        double a = sc.nextDouble();

        System.out.print("Ingresa el valor de b: ");
        double b = sc.nextDouble();

        System.out.print("Ingresa el número de subintervalos: ");
        int n = sc.nextInt();

        double resultado = trapecio(a, b, n);
        System.out.println("Resultado del método del trapecio: " + resultado);
    }
}
