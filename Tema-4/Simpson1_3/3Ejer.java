import java.util.Scanner;

public class SimpsonInteractivo {

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
        // Cambia aquí la función que desees integrar
        return Math.cos(x);  // Ejemplo: f(x) = cos(x)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el límite inferior a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese el límite superior b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese el número de subintervalos (par): ");
        int n = sc.nextInt();

        try {
            double resultado = simpson13Compuesto(a, b, n);
            System.out.println("Resultado (Simpson 1/3 Compuesto): " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
