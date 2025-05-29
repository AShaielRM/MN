public class Secante5 {
    public static void main(String[] args) {
        double x0 = 0.5, x1 = 1.0, tolerancia = 0.0001;

        for (int i = 0; i < 20; i++) {
            double fx0 = Math.cos(x0) - x0;
            double fx1 = Math.cos(x1) - x1;
            double x2 = x1 - fx1 * (x1 - x0) / (fx1 - fx0);

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, x2);

            if (Math.abs(x2 - x1) < tolerancia) break;

            x0 = x1;
            x1 = x2;
        }
    }
}
