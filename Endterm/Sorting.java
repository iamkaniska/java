
import java.util.*;
public class Sorting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int name=sc.nextInt();
        int arr[]=new int[name];
        for (int i = 0; i < name; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        for (int i = 0; i < name; i++) {
            System.out.print(arr[i]+" ");
        }
        // System.out.println();
        // for (int i =name-1; i >= 0; i--) {
        //     System.out.print(arr[i]+" ");
        // }

    }
}
