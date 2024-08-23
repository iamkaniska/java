/* The Number is Kaprekar or not */
import java.util.*;
public class kepreker {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int square=n*n;

        int numDigits = 0;
        int temp = n;
        // while (temp > 0) {
        //     temp = temp/10;
        //     numDigits++;
        // }
        for(int i=0;i<temp;i++){
            temp = temp/10;
             numDigits++;
        }
        // System.out.println(numDigits);
        
        // Calculate the divisor to split the square
        int divisor = 1;
        for (int i = 0; i < numDigits; i++) {
            divisor *= 10;
        }
        int rightPart = square % divisor;
        int leftPart = square / divisor;
        
        // Check if the sum of the parts equals the original number
        if (leftPart + rightPart == n) {
            System.out.println(n + " is a Kaprekar number.");
        } else {  
            System.out.println(n + " is not a Kaprekar number.");
        } 

    }
}
