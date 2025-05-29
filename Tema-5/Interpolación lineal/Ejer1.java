public class InterpolacionLineal1 {
    public static void main(String[] args) {
        double x0 = 10, y0 = 20;
        double x1 = 12, y1 = 24;
        double x = 11;

        double y = y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);

        System.out.println("La temperatura a las " + x + " horas es aproximadamente: " + y + " °C");
    }
}
