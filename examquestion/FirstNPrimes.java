import java.util.Scanner;

public class FirstNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of primes to generate
        System.out.print("Enter the number of prime numbers to generate: ");
        int n = sc.nextInt();

        int count = 0; // Count of primes found
        int num = 2;   // Number to check for primality

        while (count < n) {
            boolean isPrime = true; // Assume number is prime

            // Check if num is divisible by any number from 2 to num-1
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            // If num is prime, print it and increment count
            if (isPrime) {
                System.out.println(num);
                count++;
            }

            // Move to the next number
            num++;
        }
    }
}
