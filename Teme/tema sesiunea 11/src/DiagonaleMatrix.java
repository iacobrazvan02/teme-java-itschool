public class DiagonaleMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int sumaDiagonalaPrincipala = 0;
        int sumaDiagonalaSecundara = 0;

        for (int i = 0; i < matrix.length; i++) {
            // Suma diagonalei principale
            sumaDiagonalaPrincipala += matrix[i][i];
            // Suma diagonalei secundare
            sumaDiagonalaSecundara += matrix[i][matrix.length - 1 - i];
        }

        System.out.println("Suma diagonalei principale: " + sumaDiagonalaPrincipala);
        System.out.println("Suma diagonalei secundare: " + sumaDiagonalaSecundara);
    }
}
