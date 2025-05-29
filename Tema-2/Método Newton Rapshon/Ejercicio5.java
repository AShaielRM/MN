public class NewtonA {
    public static void main(String[] args) {
        double x = 1.5, tolerancia = 0.0001;
        int iter = 0, max = 20;

        while (iter < max) {
            double fx = Math.pow(x, 3) + 4 * Math.pow(x, 2) - 10;
            double dfx = 3 * Math.pow(x, 2) + 8 * x;
            x = x - fx / dfx;

            System.out.printf("Iteración %d: x = %.2f\n", iter + 1, x);
            if (Math.abs(fx) < tolerancia) break;
            iter++;
        }
    }
}
