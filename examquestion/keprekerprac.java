import java.util.*;
public class keprekerprac {
    public static void main(String[] args) {
        System.out.println("Enter Num: ");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int multi=num*num;


        int temp=num;
        int count=0;
        for(int i=0;i<temp;i++){
            temp=temp/10;
            count++;
        }
        int diviser=1;
        for(int i=0;i<count;i++){
            diviser=diviser*10;
        }
        int first=multi%diviser;
        int sec=multi/diviser;
        if(first+sec==num){
            System.out.println("this is kepler");
        }
        else{
            System.out.println("this is not");
        }
    }
}
