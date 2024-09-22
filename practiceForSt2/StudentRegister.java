import java.util.Arrays;
import java.util.Scanner;

public class StudentRegister {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();  // consume the newline after the integer input

        // Array to store student names
        String[] students = new String[n];

        // Taking input for student names
        System.out.println("Enter the names of the students: ");
        for (int i = 0; i < n; i++) {
            students[i] = scanner.nextLine();
        }

        // Sorting the student names in alphabetical order
        Arrays.sort(students);
        // Display the sorted student names
        System.out.println("Students in alphabetical order:");
        for (String student : students) {
            System.out.println(student);
        }
    }
}
