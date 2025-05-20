public class ErrorRedondeo {
//Suma de números pequeños con un número grande
    public static void main(String[] args) {
        double grande = 1e10;
        double pequeno = 1e-6;
        double resultado = (grande + pequeno) - grande;
        System.out.println("Resultado esperado: " + pequeno);
        System.out.println("Resultado obtenido: " + resultado);
    }
}
//Al sumar un número muy pequeño a uno grande y luego restar el grande, el error de redondeo puede hacer que el pequeño desaparezca.