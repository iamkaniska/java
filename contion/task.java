import java.util.*;
public class task {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if (n>=20 && n<30) {
            System.out.println("He is now 20+");
        }
        else if (n>=30 && n<=40) {
            System.out.println("He is now adult");
        }
        else{
            System.out.println("he is old");
        }

    }
}
