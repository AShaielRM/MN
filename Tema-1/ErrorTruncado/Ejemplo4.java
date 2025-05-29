import java.math.BigDecimal;
import java.math.RoundingMode;

public class Truncamiento5 {
    public static void main(String[] args) {
        double capital = 10000;
        double tasa = 0.0725; // 7.25%
        double tasaTrunc = truncar(tasa, 2);
        int años = 5;

        double valorReal = capital * Math.pow(1 + tasa, años);
        double valorTruncado = capital * Math.pow(1 + tasaTrunc, años);

        System.out.println("---- Valor Futuro de Inversión ----");
        System.out.println("Tasa exacta: " + tasa + ", Tasa truncada: " + tasaTrunc);
        System.out.println("Valor exacto: " + valorReal);
        System.out.println("Valor con tasa truncada: " + valorTruncado);
        System.out.println("Error por truncamiento: " + Math.abs(valorReal - valorTruncado));
    }

    public static double truncar(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        return bd.setScale(decimales, RoundingMode.DOWN).doubleValue();
    }
}
