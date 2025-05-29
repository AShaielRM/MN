public class Newton3 {
    public static void main(String[] args) {
        double x = 0.5;
        double tolerancia = 0.0001;

        for (int i = 0; i < 15; i++) {
            double fx = Math.cos(x) - x;
            double dfx = -Math.sin(x) - 1;
            x = x - fx / dfx;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, x);
            if (Math.abs(fx) < tolerancia) break;
        }
    }
}
