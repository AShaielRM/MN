public class OverflowSumaAcumulativa {
    public static void main(String[] args) {
        int suma = Integer.MAX_VALUE - 10;

        System.out.println("---- Suma acumulativa con riesgo de overflow ----");
        for (int i = 0; i < 20; i++) {
            System.out.printf("Iteración %2d: suma = %d\n", i + 1, suma);
            suma += 1;
        }

        System.out.println("¿Valor después de sobrepasar MAX_INT?: " + suma);
    }
}
