public class Newton4 {
    public static void main(String[] args) {
        double x = 1.0;
        double tolerancia = 0.0001;

        for (int i = 0; i < 20; i++) {
            double fx = Math.exp(x) - 3 * x;
            double dfx = Math.exp(x) - 3;
            x = x - fx / dfx;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, x);
            if (Math.abs(fx) < tolerancia) break;
        }
    }
}
