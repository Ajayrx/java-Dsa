// Wap a program to find the sum of ! to n numbers this one using loop
import java.util.*;
public class loopsum {
    public static void main(String[] args) {
        System.out.print("Enter the Value of N : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
       
        for (int i=1;i<=n;i++)
        {
            sum+=i;
        }
        System.out.println("Result is "+sum);
        sc.close();
    }
}
