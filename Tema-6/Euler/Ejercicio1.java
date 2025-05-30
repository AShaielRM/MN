public class EnfriamientoEuler {
    public static void main(String[] args) {
        double T = 90;       // Temperatura inicial
        double Ta = 25;      // Temperatura ambiente
        double k = 0.1;      // Constante de enfriamiento
        double h = 0.5;      // Paso
        double tFinal = 5.0;

        System.out.println("Tiempo\tTemperatura");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.2f\t%.4f\n", t, T);
            double dT = -k * (T - Ta);
            T = T + h * dT;
        }
    }
}
