import java.util.Scanner;

public class MatrixOperations {

    // Method to create a random matrix
    public static double[][] createRandomMatrix(int rows, int cols) {
        double[][] matrix = new double[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int)(Math.random() * 10) + 1; // 1 to 10
            }
        }
        return matrix;
    }

    // Method to find transpose of a matrix
    public static double[][] transpose(double[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        double[][] transpose = new double[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        return transpose;
    }

    // Method to find determinant of 2x2 matrix
    public static double determinant(double[][] matrix) {
        return (matrix[0][0] * matrix[1][1]) -
               (matrix[0][1] * matrix[1][0]);
    }

    // Method to find inverse of 2x2 matrix
    public static double[][] inverse(double[][] matrix) {
        double det = determinant(matrix);

        if (det == 0) {
            return null; // Inverse not possible
        }

        double[][] inverse = new double[2][2];

        inverse[0][0] = matrix[1][1] / det;
        inverse[0][1] = -matrix[0][1] / det;
        inverse[1][0] = -matrix[1][0] / det;
        inverse[1][1] = matrix[0][0] / det;

        return inverse;
    }

    // Method to display matrix
    public static void displayMatrix(double[][] matrix) {
        for (double[] row : matrix) {
            for (double value : row) {
                System.out.printf("%6.2f", value);
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();

        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        double[][] matrix = createRandomMatrix(rows, cols);

        System.out.println("\nOriginal Matrix:");
        displayMatrix(matrix);

        System.out.println("\nTranspose of Matrix:");
        displayMatrix(transpose(matrix));

        // Determinant and Inverse only for 2x2 square matrix
        if (rows == 2 && cols == 2) {

            double det = determinant(matrix);
            System.out.println("\nDeterminant = " + det);

            double[][] inv = inverse(matrix);
            if (inv != null) {
                System.out.println("\nInverse of Matrix:");
                displayMatrix(inv);
            } else {
                System.out.println("\nInverse does not exist (Determinant = 0)");
            }
        } else {
            System.out.println("\nDeterminant & Inverse are only for 2x2 matrices.");
        }

        input.close();
    }
}
