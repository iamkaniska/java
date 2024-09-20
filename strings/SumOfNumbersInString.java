import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Variable to store the sum of numbers
        int sum = 0;

        // Traverse each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Convert character to digit and add to sum
                sum += Character.getNumericValue(ch);
            }
        }

        // Output the sum
        System.out.println("The sum of numbers in the string is: " + sum);
    }
}
