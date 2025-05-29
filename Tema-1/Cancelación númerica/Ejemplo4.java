public class Cancelacion3 {
    public static void main(String[] args) {
        double x = 1e-8;
        double fx = (1 - Math.cos(x)) / (x * x);  // pérdida por cos(x) ≈ 1

        Cancelacion1.mostrar("Cancelación en (1 - cos(x)) / x²", fx);
    }
}
