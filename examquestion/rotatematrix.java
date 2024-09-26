import java.util.*;
public class rotatematrix {
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
        for(int j=i+1;j<x;j++){
            int temp=arr[i][j];
            arr[i][j]=arr[j][i];
            arr[j][i]=temp;
        }
    }
    // for(int i=0;i<x;i++){
    //     for(int j=0;j<x;j++){
    //        System.out.print (arr[i][j]+" ");
    //     }
    //     System.out.println();
    // }


    for(int k=0;k<x;k++){
        int i=0;
        int j=x-1;
        while(i<=j){
            int temp=arr[k][i];
            arr[k][i]=arr[k][j];
            arr[k][j]=temp; 
            i++;
            j--;               
        }
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
