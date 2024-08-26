import java.util.*;
public class reverseArray {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int []arr=new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            int p=0;
            int q=n-1;
            while(p<=q){
                int temp=arr[p];
                arr[p]=arr[q];
                arr[q]=temp;
                p++;
                q--;


            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]);
        }
    }
}
