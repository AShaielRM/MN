public class ResorteTaylor {
    public static void main(String[] args) {
        double x = 1.0;
        double v = 0.0;
        double k = 4.0;
        double m = 1.0;
        double h = 0.1;
        double tFinal = 2.0;

        System.out.println("Tiempo\tPosición\tVelocidad");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.2f\t%.4f\t\t%.4f\n", t, x, v);

            double dx = v;
            double dv = -k / m * x;
            double d2x = dv;
            double d2v = -k / m * v;

            x = x + h * dx + (Math.pow(h, 2) / 2) * d2x;
            v = v + h * dv + (Math.pow(h, 2) / 2) * d2v;
        }
    }
}
