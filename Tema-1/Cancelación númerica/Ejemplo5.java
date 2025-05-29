public class Cancelacion4 {
    public static void main(String[] args) {
        double x = 1.00001;
        double fx = Math.log(x) - (x - 1);  // debería acercarse a cero

        Cancelacion1.mostrar("Cancelación en log(x) - (x - 1)", fx);
    }
}
