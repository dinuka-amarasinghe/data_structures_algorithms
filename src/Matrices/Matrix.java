package Matrices;

public class Matrix {

    // Counter for calls of multiply method
    static int multiplyCount = 0;

    public static void printMatrix(int[][] matrix) {
        int dimension = matrix.length;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
            System.out.println();
        }
    }

    // Function to multiply two matrices
    public static int[][] multiplyMatrix(int[][] A, int[][] B) {
        int dimension = A.length;
        int[][] result = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                result[i][j] = 0;
                for (int k = 0; k < dimension; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }

    // Brute force version of matrix power
    public static int[][] slowPower(int[][] matrix, int exponent) {
        int dimension = matrix.length;
        int[][] result = new int[dimension][dimension];
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                result[i][j] = matrix[i][j];
            }
        }

        for (int i = 0; i < exponent; i++) {
            result = multiplyMatrix(result, matrix);
        }
        return result;
    }

    // Divide-and-conquer version of matrix power
    public static int[][] fastPower(int[][] matrix, int exponent) {
        if (exponent == 1) {
            return matrix;
        }
        // First recursively compute the power with half the exponent (rounding down)
        int[][] result_half = fastPower(matrix, exponent / 2);
        // Then square it
        int[][] result_even = multiplyMatrix(result_half, result_half);
        // If the exponent is even, this is the result, e.g. A^6 = (A^3)^2
        if (exponent % 2 == 0) {
            return result_even;
        }
        // Otherwise we need to multiply by the matrix once more, e.g. A^7 = (A^3)^2 * A
        return multiplyMatrix(result_even, matrix);
    }


    public static void main(String[] args) {
        // Try changing the dimension (needs to still be square) and exponent
        // to see how the number of multiplications and the runtime change
        int[][] matrix = {{1, 2}, {3, 4}};
        int exponent = 1000000;

        System.out.println();
        System.out.println("Using slowPower, with exponent: " + exponent);
        System.out.println();

        multiplyCount = 0;
        long start = System.currentTimeMillis();
        printMatrix(slowPower(matrix, exponent));
        long middle = System.currentTimeMillis();

        System.out.println();
        System.out.println("Used " + multiplyCount + " multiplications, " + (middle - start) + " milliseconds");
        System.out.println();

        System.out.println();
        System.out.println("Using fastPower, with exponent: " + exponent);
        System.out.println();

        multiplyCount = 0;
        printMatrix(fastPower(matrix, exponent));
        long end = System.currentTimeMillis();

        System.out.println();
        System.out.println("Used " + multiplyCount + " multiplications, " + (end - middle) + " milliseconds");
        System.out.println();

    }
}
