public class Biseccion3 {
    public static void main(String[] args) {
        double a = 1, b = 4, tolerancia = 0.0001;

        for (int i = 0; i < 50; i++) {
            double xm = (a + b) / 2;
            double fa = Math.log(a) + a - 5;
            double fxm = Math.log(xm) + xm - 5;

            System.out.printf("Iteración %d: x = %.2f\n", i + 1, xm);

            if (Math.abs(fxm) < tolerancia) break;

            if (fa * fxm < 0)
                b = xm;
            else
                a = xm;
        }
    }
}
