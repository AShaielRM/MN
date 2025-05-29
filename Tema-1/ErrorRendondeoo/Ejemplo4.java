public class ErrorRedondeo5 {
    public static void main(String[] args) {
        double total = 1.0;
        double parte1 = 0.3333333;
        double parte2 = 0.3333333;
        double parte3 = 0.3333333;

        double resta = total - parte1 - parte2 - parte3;

        RedondeoUtils.mostrar("1 - 0.333... x3", resta);  // Esperado: 0
    }
}
