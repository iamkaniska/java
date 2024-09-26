import java.util.*;
public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int arr[]=new int[num];
        for (int i = 0; i < num; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < num; i++) {
            int start=0;
            int end=num-1;
            while(start<=end){
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }
        for (int i = 0; i < num; i++) {
           System.out.print(arr[i]+" ");
        }
    }
}
