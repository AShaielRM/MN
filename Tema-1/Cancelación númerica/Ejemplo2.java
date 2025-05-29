public class Cancelacion2 {
    public static void main(String[] args) {
        double a = 1.0, b = -10000.0, c = 1.0;
        double discriminante = b * b - 4 * a * c;
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);

        Cancelacion1.mostrar("Raíz x1 cuadrática", x1);
        Cancelacion1.mostrar("Raíz x2 cuadrática", x2);
    }
}
