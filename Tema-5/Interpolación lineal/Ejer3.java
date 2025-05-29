public class InterpolacionLineal6 {
    public static void main(String[] args) {
        // Paso 1: Datos conocidos
        double T1 = 300; // temperatura en Kelvin
        double P1 = 2.0; // presión en atm

        double T2 = 350;
        double P2 = 2.5;

        // Paso 2: Temperatura deseada
        double T = 320;

        // Paso 3: Interpolación
        double P = P1 + ((P2 - P1) / (T2 - T1)) * (T - T1);

        // Paso 4: Mostrar resultado
        System.out.println("Presión estimada a " + T + " K: " + P + " atm");
    }
}
