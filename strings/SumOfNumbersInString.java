import java.util.Scanner;

public class SumOfNumbersInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        int sum = 0;
        String temp = "0"; // To temporarily store numbers
        // Traverse each character in the string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            // Check if the character is a digit
            if (Character.isDigit(ch)) {
                // Append digit to temporary number string
                temp += ch;
            } else {
                // If non-digit is found, convert temp to number and add to sum
                sum += Integer.parseInt(temp);
                temp = "0"; // Reset temp
            }
        }

        // Add the last number (if any) to the sum
        sum += Integer.parseInt(temp);

        // Output the sum
        System.out.println("The sum of numbers in the string is: " + sum);
    }
}
