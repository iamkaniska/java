import java.util.*;
public class triangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for (int i = 0; i < a; i++) {
            for (int j = i; j < a; j++) {
                System.out.println(j);
            }
        }
    }
}
