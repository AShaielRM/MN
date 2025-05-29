import java.math.BigDecimal;
import java.math.RoundingMode;

public class Cancelacion1 {
    public static void main(String[] args) {
        double a = 1000.01;
        double b = 1000.00;
        double result = a - b;

        mostrar("Cancelación por resta", result);
    }

    static void mostrar(String mensaje, double valor) {
        System.out.println("---- " + mensaje + " ----");
        System.out.println("Valor original: " + valor);
        System.out.println("Truncado a 2 decimales: " + truncar(valor, 2));
        System.out.println("Redondeado a 2 decimales: " + redondear(valor, 2));
        System.out.println();
    }

    static double truncar(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(decimales, RoundingMode.DOWN);
        return bd.doubleValue();
    }

    static double redondear(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
