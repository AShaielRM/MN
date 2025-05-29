import java.math.BigDecimal;
import java.math.RoundingMode;

public class Truncamiento1 {
    public static void main(String[] args) {
        double x = 2.0;
        double h = 0.005678; // Valor real
        double hTrunc = truncar(h, 2); // Truncado a 2 decimales

        double derivadaExacta = 2 * x;
        double derivadaAproxReal = (Math.pow(x + h, 2) - Math.pow(x, 2)) / h;
        double derivadaAproxTrunc = (Math.pow(x + hTrunc, 2) - Math.pow(x, 2)) / hTrunc;

        System.out.println("---- Derivada de f(x) = x² en x = 2 ----");
        System.out.println("h original: " + h + ", h truncado: " + hTrunc);
        System.out.println("Derivada exacta: " + derivadaExacta);
        System.out.println("Aproximación con h real: " + derivadaAproxReal);
        System.out.println("Aproximación con h truncado: " + derivadaAproxTrunc);
        System.out.println("Error por truncamiento: " + Math.abs(derivadaAproxReal - derivadaAproxTrunc));
    }

    public static double truncar(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        return bd.setScale(decimales, RoundingMode.DOWN).doubleValue();
    }
}
