public class FalsaPosicion3 {
    public static void main(String[] args) {
        double a = 1, b = 4, tol = 0.0001;

        for (int i = 0; i < 50; i++) {
            double fa = Math.log(a) + a - 5;
            double fb = Math.log(b) + b - 5;
            double xr = b - fb * (b - a) / (fb - fa);
            double fxr = Math.log(xr) + xr - 5;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, xr);

            if (Math.abs(fxr) < tol) break;

            if (fa * fxr < 0) b = xr;
            else a = xr;
        }
    }
}
