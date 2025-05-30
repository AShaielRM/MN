public class EnfriamientoRK4 {
    public static void main(String[] args) {
        double T = 90;
        double Ta = 25;
        double k = 0.1;
        double h = 0.5;
        double tFinal = 5.0;

        System.out.println("Tiempo\tTemperatura");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.2f\t%.4f\n", t, T);

            double k1 = -k * (T - Ta);
            double k2 = -k * ((T + h * k1 / 2) - Ta);
            double k3 = -k * ((T + h * k2 / 2) - Ta);
            double k4 = -k * ((T + h * k3) - Ta);

            T = T + (h / 6) * (k1 + 2*k2 + 2*k3 + k4);
        }
    }
}
