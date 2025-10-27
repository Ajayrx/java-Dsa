// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 21 ..... 

import java.util.*;
public class q10 {
    public static int fibonacci(int n){
        int a=0,b=1,temp;
        // if (n<=1) return n;
        if (n==0) return 0;
        if (n==1) return 1;
        for (int i=2;i<=n;i++){
            temp=a+b;
            a=b;
            b=temp;
        }
        return b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many terms: ");
        int n = sc.nextInt();

        System.out.print("Fibonnaci series : ");
        for (int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }

        sc.close();
        
    }
}
