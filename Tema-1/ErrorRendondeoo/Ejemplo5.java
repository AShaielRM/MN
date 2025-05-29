import java.math.BigDecimal;
import java.math.RoundingMode;

public class ErrorRedondeoLargo2 {
    public static void main(String[] args) {
        double[] productos = {19.99, 5.49, 3.50, 4.25, 6.99};  // precios sin impuestos
        double tasaIVA = 0.16;  // 16%

        double totalConIVA = 0;
        double ivaSeparado = 0;

        System.out.println("---- Detalle de productos con IVA ----");

        for (double precio : productos) {
            double iva = precio * tasaIVA;
            double precioConIVA = precio + iva;

            // Redondeamos cada IVA a 2 cifras
            double ivaRedondeado = redondear(iva, 2);
            double totalRedondeado = redondear(precioConIVA, 2);

            System.out.println("Producto: $" + precio + " | IVA: $" + ivaRedondeado + " | Total: $" + totalRedondeado);

            ivaSeparado += ivaRedondeado;
            totalConIVA += totalRedondeado;
        }

        // Cálculo exacto de total sin redondeos por producto
        double sumaPrecios = 0;
        for (double p : productos) sumaPrecios += p;
        double ivaGlobal = sumaPrecios * tasaIVA;
        double totalGlobal = sumaPrecios + ivaGlobal;

        System.out.println("\n---- Resultados Globales ----");
        System.out.println("IVA acumulado redondeado: $" + redondear(ivaSeparado, 2));
        System.out.println("Total con IVA redondeado por producto: $" + redondear(totalConIVA, 2));
        System.out.println("IVA global exacto: $" + redondear(ivaGlobal, 2));
        System.out.println("Total global exacto: $" + redondear(totalGlobal, 2));
    }

    public static double redondear(double valor, int decimales) {
        BigDecimal bd = new BigDecimal(valor);
        bd = bd.setScale(decimales, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
