//Print all even numbers till n.
import java.util.*;
public class evenn {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n : ");
        int n= sc.nextInt();
        for (int i=2;i<=n;i=i+2){
            System.out.println(i);
            //i=i+2;
        }
        sc.close();
    }
    
}
