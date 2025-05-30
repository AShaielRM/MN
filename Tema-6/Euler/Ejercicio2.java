public class CrecimientoPoblacionalEuler {
    public static void main(String[] args) {
        double P = 100;      // Población inicial
        double r = 0.03;     // Tasa de crecimiento
        double h = 1.0;      // Paso
        double tFinal = 10.0;

        System.out.println("Hora\tPoblación");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.0f\t%.4f\n", t, P);
            double dP = r * P;
            P = P + h * dP;
        }
    }
}
