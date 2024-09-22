import java.util.*;
public class task2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        sc.nextLine();
        String []name=new String[number];
        for(int i=0;i<number;i++){
            name[i]=sc.nextLine();
        }
        Arrays.sort(name);
        for(String student: name){
            System.out.println(student);
        }

    }
}
