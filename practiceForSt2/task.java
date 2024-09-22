import java.util.*;
public class task {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String name=sc.nextLine();
        int add=0;
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            if(Character.isDigit(ch)){
                add+=Character.getNumericValue(ch);
            }
        }
        
            System.out.println(add);

    }
}
