public class Secante1 {
    public static void main(String[] args) {
        double x0 = 1.0, x1 = 3.0, tolerancia = 0.0001;
        int maxIter = 20;

        for (int i = 0; i < maxIter; i++) {
            double fx0 = x0 * x0 - 4;
            double fx1 = x1 * x1 - 4;
            double x2 = x1 - fx1 * (x1 - x0) / (fx1 - fx0);

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, x2);

            if (Math.abs(x2 - x1) < tolerancia) break;

            x0 = x1;
            x1 = x2;
        }
    }
}
