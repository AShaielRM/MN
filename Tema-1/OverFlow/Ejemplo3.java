import java.math.BigInteger;

public class OverflowFactorialGrande {
    public static void main(String[] args) {
        long factLong = 1;
        BigInteger factBig = BigInteger.ONE;

        System.out.println("---- Factorial con long vs BigInteger ----");
        for (int i = 1; i <= 30; i++) {
            factLong *= i;
            factBig = factBig.multiply(BigInteger.valueOf(i));
            System.out.printf("%2d! con long: %d\n", i, factLong);
        }

        System.out.println("\n30! con BigInteger: " + factBig);
    }
}
