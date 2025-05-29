public class Newton2 {
    public static void main(String[] args) {
        double x = 1.5;
        double tolerancia = 0.0001;

        for (int i = 0; i < 15; i++) {
            double fx = Math.pow(x, 3) - x - 1;
            double dfx = 3 * Math.pow(x, 2) - 1;
            x = x - fx / dfx;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, x);
            if (Math.abs(fx) < tolerancia) break;
        }
    }
}
