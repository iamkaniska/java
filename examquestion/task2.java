import java.util.*;
public class task2 {
    public static void main(String[] args){
    System.out.println("Enter size: ");
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int[][] arr=new int[x][x];
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
            arr[i][j]=sc.nextInt();
        }
    }
    System.out.println();
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
           System.out.print (arr[i][j]+" ");
        }
        System.out.println();
    }

    
    System.out.println();
    for(int i=0;i<x;i++){
        for(int j=0;j<x;j++){
           System.out.print (arr[i][j]+" ");
        }
        System.out.println();
    }
     }

}

}
