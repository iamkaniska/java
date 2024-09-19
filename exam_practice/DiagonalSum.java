import java.util.Scanner;

public class DiagonalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the square matrix: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        // for (int i = 0; i < n; i++) {
        //     primaryDiagonalSum += matrix[i][i];
        //     secondaryDiagonalSum += matrix[i][n - i - 1]; 
        // }
        System.out.println(matrix);
        // System.out.println("Sum of the primary diagonal: " + primaryDiagonalSum);
        // System.out.println("Sum of the secondary diagonal: " + secondaryDiagonalSum);
        // System.out.println("Total sum of both diagonals: " + (primaryDiagonalSum + secondaryDiagonalSum));
    }
}

