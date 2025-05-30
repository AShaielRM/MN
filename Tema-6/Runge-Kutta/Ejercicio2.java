public class CrecimientoPoblacionalRK4 {
    public static void main(String[] args) {
        double P = 100;
        double r = 0.03;
        double h = 1.0;
        double tFinal = 10.0;

        System.out.println("Hora\tPoblación");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.0f\t%.4f\n", t, P);

            double k1 = r * P;
            double k2 = r * (P + h * k1 / 2);
            double k3 = r * (P + h * k2 / 2);
            double k4 = r * (P + h * k3);

            P = P + (h / 6) * (k1 + 2*k2 + 2*k3 + k4);
        }
    }
}
