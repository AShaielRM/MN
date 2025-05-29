public class FalsaPosicion1 {
    public static void main(String[] args) {
        double a = 2, b = 3, tol = 0.0001;
        int maxIter = 50;

        for (int i = 0; i < maxIter; i++) {
            double fa = Math.pow(a, 3) - 4 * a - 9;
            double fb = Math.pow(b, 3) - 4 * b - 9;
            double xr = b - fb * (b - a) / (fb - fa);
            double fxr = Math.pow(xr, 3) - 4 * xr - 9;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, xr);

            if (Math.abs(fxr) < tol) break;

            if (fa * fxr < 0) b = xr;
            else a = xr;
        }
    }
}
