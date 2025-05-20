public class ErrorPorcentual {
    public static void main(String[] args) {
        double valorReal = Math.PI;  // Valor real de π
        double valorAproximado = 3.14;  // Aproximación común

        double errorPorcentual = Math.abs((valorReal - valorAproximado) / valorReal) * 100;

        System.out.println("Error porcentual: " + errorPorcentual + "%");
    }
}
//Comparamos la aproximación 3.14 con el valor real de π para calcular el error porcentual.