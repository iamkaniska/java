import java.util.*;
public class numberSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int store=0;
       // for (int i = 0; i < n; i++) {
            while(n!=0){
            store+=n%10;
            n=n/10;
            }
            System.out.println(store);  
        }


    
}
