public class OverflowIntVsLong {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 3_000;

        int resultadoInt = a * b; // Overflow esperado
        long resultadoLong = (long) a * b; // Prevención del overflow

        System.out.println("---- Multiplicación con int ----");
        System.out.println("a = " + a + ", b = " + b);
        System.out.println("Resultado (int): " + resultadoInt); // Resultado incorrecto
        System.out.println("Resultado (long): " + resultadoLong); // Resultado correcto
        System.out.println("Diferencia: " + (resultadoLong - resultadoInt));
    }
}
