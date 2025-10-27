// Two numbers are entered by the user, x and n. 
// Write a function to find the value of one number raised to the power of another i.e. xn.

import java.util.*;
public class question8 {
    public static double raisedtopower(double x,double n){
        return Math.pow(x,n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the vale of x & n so to raised to the power of another i.e. x^n  ");
        System.out.println("Enter the value of X : ");
        int a= sc.nextInt();
        System.out.println("Enter the value of N : ");
        int b= sc.nextInt();
        System.out.println("X^n is = "+raisedtopower(a,b));
        sc.close();
    }
}
