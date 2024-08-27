import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        if (isKaprekar(n)) {
            System.out.println(n + " is a Kaprekar number.");
        } else {
            System.out.println(n + " is not a Kaprekar number.");
        }
        
        scanner.close();
    }

    public static boolean isKaprekar(int n) {
        if (n == 1) return true;

        int square = n * n;
        String strSquare = Integer.toString(square);
        int length = strSquare.length();
        
        for (int i = 1; i < length; i++) {
            String leftPart = strSquare.substring(0, i);
            String rightPart = strSquare.substring(i);
            
            int left = Integer.parseInt(leftPart);
            int right = Integer.parseInt(rightPart);
            
            if (right > 0 && (left + right) == n) {
                return true;
            }
        }
        
        return false;
    }
}
