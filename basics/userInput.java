/* WAP using user input to check wheather the number is even or odd */
import java.util.*;
public class userInput {
     public static void main(String[] args) {
        System.out.print("Enter Number: ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println(num);
        if (num%2==0) {
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
     }
}
