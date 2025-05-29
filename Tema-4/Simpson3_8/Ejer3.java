import java.util.Scanner;

public class Simpson38Interactivo {

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
        return Math.cos(x);  // Ejemplo: f(x) = cos(x)
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese límite inferior a: ");
        double a = sc.nextDouble();

        System.out.print("Ingrese límite superior b: ");
        double b = sc.nextDouble();

        System.out.print("Ingrese número de subintervalos (múltiplo de 3): ");
        int n = sc.nextInt();

        try {
            double resultado = simpson38Compuesto(a, b, n);
            System.out.println("Resultado Simpson 3/8 Compuesto: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}
