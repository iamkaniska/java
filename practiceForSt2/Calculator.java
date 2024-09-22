import java.util.Scanner;
import java.util.InputMismatchException;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = 0, num2 = 0;
        try {
            System.out.println("Enter the first number: ");
            num1 = scanner.nextInt();
            System.out.println("Enter the second number: ");
            num2 = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter numeric values.");
            return; 
        }
        try {
            System.out.println("Sum: " + (num1 + num2));
            System.out.println("Difference: " + (num1 - num2));
            System.out.println("Product: " + (num1 * num2));
            if (num2 != 0) {
                System.out.println("Quotient: " + (num1 / num2));
            } else {
                System.out.println("Cannot divide by zero.");
            }

        } catch (ArithmeticException e) {
            // Catching arithmetic errors like division by zero (in case of integer division)
            System.out.println("An arithmetic error occurred: " + e.getMessage());
        }
    }
}
