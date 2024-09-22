package strings;
import java.util.*;
public class sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of an array: ");
        int n=sc.nextInt();
        int []arr=new int[n];
        System.out.println("Enter the array Element: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");;
        }
        System.out.println();
        System.out.println("Enter the string value: ");
        String []name=new String[n];
        for(int i=0;i<n;i++){
            name[i]=sc.nextLine();
        }
        System.out.println("the string fromat array: ");
        for(int i=0;i<n;i++){
            System.out.print(name[i]);;
        }



    }
}
