import java.math.BigDecimal;
import java.math.RoundingMode;

public class Truncamiento2 {
    public static void main(String[] args) {
        double[] fracciones = {1.0/3, 1.0/7, 1.0/9};
        double sumaExacta = 0;
        double sumaTruncada = 0;

        for (double f : fracciones) {
            sumaExacta += f;
            sumaTruncada += truncar(f, 2);
        }

        System.out.println("---- Suma de fracciones ----");
        System.out.println("Suma exacta: " + sumaExacta);
        System.out.println("Suma truncada: " + sumaTruncada);
        System.out.println("Error por truncamiento: " + Math.abs(sumaExacta - sumaTruncada));
    }

    public static double truncar(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        return bd.setScale(decimales, RoundingMode.DOWN).doubleValue();
    }
}
