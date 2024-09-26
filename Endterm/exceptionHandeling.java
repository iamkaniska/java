import java.util.*;
public class exceptionHandeling {
    public static void main(String[] args){
        int arr[]=new int[3];
        arr[0]=3;
        arr[1]=10;
        arr[2]=12;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the index Number: ");
        int num=sc.nextInt();
        System.out.println("Enter the number you want to dividie: ");
        int div=sc.nextInt();
        try{
            System.out.println("the value of the index that you have mentioned:"+arr[num]);
            System.out.println("the output will be:"+arr[num]/div);

        }
        catch(ArithmeticException e){
            System.out.println("some ArithmeticException exception occured");
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("some ArrayIndexOutOfBoundsException exception occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("some exception occured");
            System.out.println(e);
        }

    }
}
