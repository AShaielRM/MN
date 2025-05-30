public class ResorteRK4 {
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

            // k1
            double dx1 = v;
            double dv1 = -k / m * x;

            // k2
            double dx2 = v + h * dv1 / 2;
            double dv2 = -k / m * (x + h * dx1 / 2);

            // k3
            double dx3 = v + h * dv2 / 2;
            double dv3 = -k / m * (x + h * dx2 / 2);

            // k4
            double dx4 = v + h * dv3;
            double dv4 = -k / m * (x + h * dx3);

            x = x + (h / 6) * (dx1 + 2*dx2 + 2*dx3 + dx4);
            v = v + (h / 6) * (dv1 + 2*dv2 + 2*dv3 + dv4);
        }
    }
}
