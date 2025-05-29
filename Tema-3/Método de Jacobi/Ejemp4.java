public class JacobiDominancia {
    public static void main(String[] args) {
        double[][] A = {
            {4, 1, 1},
            {2, 7, 1},
            {1, -3, 12}
        };

        if (!esDominante(A)) {
            System.out.println("La matriz no es diagonalmente dominante. El método de Jacobi podría no converger.");
            return;
        } else {
            System.out.println("La matriz es diagonalmente dominante. Continuando con el método de Jacobi.");
        }

        // Aquí podrías aplicar Jacobi como en los otros ejemplos.
    }

    public static boolean esDominante(double[][] A) {
        for (int i = 0; i < A.length; i++) {
            double suma = 0;
            for (int j = 0; j < A.length; j++) {
                if (i != j) suma += Math.abs(A[i][j]);
            }
            if (Math.abs(A[i][i]) < suma) return false;
        }
        return true;
    }
}
