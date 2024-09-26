import java.util.*;
// Other imports go here, Do NOT change the class name
public class task{


  public static void main(String[] args)
  {
    // Write your code here
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[][]=new int[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        int temp=arr[i][j];
        arr[i][j]=arr[j][i];
        arr[j][i]=temp;
      }
    }
    for(int k=0;k<n;k++){
      int i=0;
      int j=n-1;
      while(i<=j){
        int temp=arr[k][i];
        arr[k][i]=arr[k][j];
        arr[k][j]=temp;
      }
    }
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        System.out.print(arr[i][j]);
      }
      System.out.println();
    }
    
    
  }
}
