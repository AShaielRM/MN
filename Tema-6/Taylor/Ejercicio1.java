public class EnfriamientoTaylor {
    public static void main(String[] args) {
        double T = 90;
        double Ta = 25;
        double k = 0.1;
        double h = 0.5;
        double tFinal = 5.0;

        System.out.println("Tiempo\tTemperatura");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.2f\t%.4f\n", t, T);
            double dT = -k * (T - Ta);
            double d2T = k * k * (T - Ta);
            T = T + h * dT + (Math.pow(h, 2) / 2) * d2T;
        }
    }
}
