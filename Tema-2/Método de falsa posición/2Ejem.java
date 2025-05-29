public class FalsaPosicion2 {
    public static void main(String[] args) {
        double a = 1, b = 2, tol = 0.0001;

        for (int i = 0; i < 50; i++) {
            double fa = a * a - 2;
            double fb = b * b - 2;
            double xr = b - fb * (b - a) / (fb - fa);
            double fxr = xr * xr - 2;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, xr);

            if (Math.abs(fxr) < tol) break;

            if (fa * fxr < 0) b = xr;
            else a = xr;
        }
    }
}
