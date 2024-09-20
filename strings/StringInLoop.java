import java.util.*;

public class StringInLoop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        System.out.println("name is "+name);
        System.out.println("name size "+name.length());
        System.out.println("name size "+name.charAt(0));
        for(int i=0;i<name.length();i++){
            System.out.println(name.charAt(i));
        }

    }
}
