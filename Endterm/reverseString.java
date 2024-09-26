import java.util.*;
public class reverseString {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String str=sc.nextLine();
      String reverse="";
      for(int i=0;i<str.length();i++){
        reverse=str.charAt(i)+reverse;
      }
      System.out.println(reverse);
      

    }
}
