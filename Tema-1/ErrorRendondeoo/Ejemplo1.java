import java.math.BigDecimal;
import java.math.RoundingMode;

public class RedondeoUtils {
    public static void mostrar(String mensaje, double valor) {
        System.out.println("---- " + mensaje + " ----");
        System.out.println("Valor original: " + valor);
        System.out.println("Truncado a 2 decimales: " + truncar(valor, 2));
        System.out.println("Redondeado a 2 decimales: " + redondear(valor, 2));
        System.out.println();
    }

    public static double truncar(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(decimales, RoundingMode.DOWN);
        return bd.doubleValue();
    }

    public static double redondear(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
