// Two numbers are entered by the user, x and n. 
// Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class q8 {
    public static double power(double x, double n){
        double res=1;
        for (int i=1;i<=n;i++){
            res=res*x;
        }
        return res;
    }
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the vale of x & n so to raised to the power of another i.e. x^n  ");
        System.out.print("Enter the value of X : ");
        int a= sc.nextInt();
        System.out.print("Enter the value of N : ");
        int b= sc.nextInt();
        System.out.println("X^n is = "+power(a,b));
        sc.close();
    }
}
