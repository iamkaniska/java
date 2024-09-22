import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        
        int[] arr = new int[size];
        
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Count the total number of non-empty combinations (2^n - 1)
        int totalCombinations = (1 << size) - 1;
        
        System.out.println("Total number of non-empty combinations: " + totalCombinations);
        
        sc.close();
    }
}
