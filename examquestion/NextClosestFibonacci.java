import java.util.Scanner;

public class NextClosestFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the target number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Initialize the first two Fibonacci numbers
        int a = 0;
        int b = 1;

        // Generate Fibonacci numbers until we find one that is greater than or equal to num
        int nextFib = 0;
        while (nextFib < num) {
            nextFib = a + b;  // Calculate the next Fibonacci number
            a = b;            // Move to the next pair of Fibonacci numbers
            b = nextFib;
        }

        // Output the closest Fibonacci number greater than or equal to num
        System.out.println("The next closest Fibonacci number is: " + a);

        sc.close();
    }
}