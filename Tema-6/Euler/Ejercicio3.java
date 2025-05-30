public class ResorteEuler {
    public static void main(String[] args) {
        double x = 1.0;      // Posición inicial
        double v = 0.0;      // Velocidad inicial
        double k = 4.0;      // Constante del resorte
        double m = 1.0;      // Masa
        double h = 0.1;      // Paso
        double tFinal = 2.0;

        System.out.println("Tiempo\tPosición\tVelocidad");

        for (double t = 0; t <= tFinal; t += h) {
            System.out.printf("%.2f\t%.4f\t\t%.4f\n", t, x, v);
            double a = -k / m * x; // aceleración = dv/dt
            x = x + h * v;         // nueva posición
            v = v + h * a;         // nueva velocidad
        }
    }
}
