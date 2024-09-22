import java.util.Scanner;

public class ConvertToUppercase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        // Convert each character to uppercase manually
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                // Convert lowercase letters to uppercase by subtracting 32
                result += (char) (ch - 32);
            } else {
                result += ch;
            }
        }
        
        // Display the uppercase string
        System.out.println("Uppercase string: " + result);
    }
}
