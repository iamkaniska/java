/* insertion sorting  */
import java.util.*;
public class insertionSort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); 
         }
        for(int i=0;i<arr.length;i++){
            int element=arr[i];
            int j=i-1;
            while(j>=0 && element<arr[j]){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=element;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" "); 
         }


    }
}
