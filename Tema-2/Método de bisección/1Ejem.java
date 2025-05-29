public class Biseccion1 {
    public static void main(String[] args) {
        double a = 2, b = 3, tolerancia = 0.0001;
        int maxIter = 50;

        for (int i = 0; i < maxIter; i++) {
            double xm = (a + b) / 2;
            double fa = Math.pow(a, 3) - 4 * a - 9;
            double fxm = Math.pow(xm, 3) - 4 * xm - 9;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, xm);

            if (Math.abs(fxm) < tolerancia) break;

            if (fa * fxm < 0)
                b = xm;
            else
                a = xm;
        }
    }
}
