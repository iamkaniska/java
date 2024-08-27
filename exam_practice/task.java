import java.util.*;
public class task {
    public static void main(String[] args){
        System.out.println("Enter size of an array : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.println("Now write the array element: ");
        int[] arr=new int[num];
        for(int i=0;i<num;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("The finding element : ");
        int find=sc.nextInt();
        System.out.println("and the element is : ");
        for (int i = 0; i < num; i++) {
            if (arr[i]==find) {
                System.out.println(arr[i]);
            }
        }
        // System.out.println("answer");
        // for(int i=0;i<num;i++){
        //     System.out.println(arr[i]);
        // }
    }
}
