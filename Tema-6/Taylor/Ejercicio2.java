public class CrecimientoPoblacionalTaylor {
    public static void main(String[] args) {
        double P = 100;
        double r = 0.03;
        double h = 1.0;
        double tFinal = 10.0;

        System.out.println("Hora\tPoblación");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.0f\t%.4f\n", t, P);
            double dP = r * P;
            double d2P = r * r * P;
            P = P + h * dP + (Math.pow(h, 2) / 2) * d2P;
        }
    }
}
