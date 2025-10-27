import java.util.*;
public class calculatesum {
    public static int sum(int a,int b) {
        int sum=a+b;
        return sum;  
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print(" enter the value of a : ");
        int a=sc.nextInt();
        System.out.print("Enter value of b : ");
        int b=sc.nextInt();

        int  sum=sum(a,b);
        System.out.println("sum = "+sum);
        sc.close();
    }
}
