public class Biseccion2 {
    public static void main(String[] args) {
        double a = 1, b = 2, tolerancia = 0.0001;

        for (int i = 0; i < 50; i++) {
            double xm = (a + b) / 2;
            double fa = a * a - 2;
            double fxm = xm * xm - 2;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, xm);

            if (Math.abs(fxm) < tolerancia) break;

            if (fa * fxm < 0)
                b = xm;
            else
                a = xm;
        }
    }
}
