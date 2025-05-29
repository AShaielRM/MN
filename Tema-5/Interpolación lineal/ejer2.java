public class InterpolacionLineal5 {
    public static void main(String[] args) {
        // Paso 1: Definir los dos puntos conocidos
        double x0 = 2.2, y0 = 4.84;
        double x1 = 3.1, y1 = 9.61;

        // Paso 2: Valor a interpolar
        double x = 2.5;

        // Paso 3: Aplicar la fórmula de interpolación lineal
        double y = y0 + ((y1 - y0) / (x1 - x0)) * (x - x0);

        // Paso 4: Mostrar resultado
        System.out.println("Estimación de f(" + x + ") = " + y);
    }
}
