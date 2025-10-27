// Enter 3 numbers from the user & make a function to prdouble their average.

import java.util.*;
public class q1 {
    public static double average(double n1,double n2,double n3){
        return (n1+n2+n3)/3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter 3 numbers ");

        System.out.print("No 1 = ");
        double n1 = sc.nextDouble();

        System.out.print("No 2 = ");
        double n2 = sc.nextDouble();

        System.out.print("No 3 = ");
        double n3 = sc.nextDouble();

        double result=average(n1, n2, n3);
        System.out.printf("Average of %.1f, %.1f, and %.1f = %.2f" ,n1,n2,n3,result);
        sc.close();
    }
}
