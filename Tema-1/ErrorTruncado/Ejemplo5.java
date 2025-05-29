import java.math.BigDecimal;
import java.math.RoundingMode;

public class Truncamiento4 {
    public static void main(String[] args) {
        double[] calificaciones = {89.56, 92.33, 85.78, 90.67, 88.92};
        double sumaExacta = 0;
        double sumaTruncada = 0;

        for (double c : calificaciones) {
            sumaExacta += c;
            sumaTruncada += truncar(c, 2);
        }

        double promedioExacto = sumaExacta / calificaciones.length;
        double promedioTruncado = sumaTruncada / calificaciones.length;

        System.out.println("---- Promedio de calificaciones ----");
        System.out.println("Promedio exacto: " + promedioExacto);
        System.out.println("Promedio truncado: " + promedioTruncado);
        System.out.println("Error por truncamiento: " + Math.abs(promedioExacto - promedioTruncado));
    }

    public static double truncar(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        return bd.setScale(decimales, RoundingMode.DOWN).doubleValue();
    }
}
