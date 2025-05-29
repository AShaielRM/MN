public class Newton1 {
    public static void main(String[] args) {
        double x = 1.0; // Valor inicial
        double tolerancia = 0.0001;
        int maxIter = 20;

        for (int i = 0; i < maxIter; i++) {
            double fx = x * x - 2;
            double dfx = 2 * x;
            x = x - fx / dfx;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, x);
            if (Math.abs(fx) < tolerancia) break;
        }
    }
}
