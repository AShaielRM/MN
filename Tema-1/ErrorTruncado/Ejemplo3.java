import java.math.BigDecimal;
import java.math.RoundingMode;

public class Truncamiento3 {
    public static void main(String[] args) {
        double radio = 5.0;
        double pi = Math.PI;
        double piTrunc = truncar(pi, 2);

        double areaExacta = pi * radio * radio;
        double areaTruncada = piTrunc * radio * radio;

        System.out.println("---- Área de un círculo ----");
        System.out.println("π exacto: " + pi + ", π truncado: " + piTrunc);
        System.out.println("Área exacta: " + areaExacta);
        System.out.println("Área con π truncado: " + areaTruncada);
        System.out.println("Error por truncamiento: " + Math.abs(areaExacta - areaTruncada));
    }

    public static double truncar(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        return bd.setScale(decimales, RoundingMode.DOWN).doubleValue();
    }
}
