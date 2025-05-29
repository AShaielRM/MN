public class OverflowFloatExp {
    public static void main(String[] args) {
        float base = 1e10f;
        float resultado = base;

        System.out.println("---- Potencias crecientes con float ----");
        for (int i = 1; i <= 10; i++) {
            resultado *= base;
            System.out.println("Iteración " + i + ": resultado = " + resultado);
        }

        System.out.println("¿Es infinito?: " + (resultado == Float.POSITIVE_INFINITY));
    }
}
