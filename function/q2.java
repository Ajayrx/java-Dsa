// Write a function to print the sum of all odd numbers from 1 to n.

import java.util.*;

public class q2 {
    public static void oddnosum(int n) {
        //int sum = 0;
        if (n < 0) {
            System.out.println("negative number");
            return;
        }

        int m = (n+1)/2;
        int sum = m*m;
        // for (int i = 1; i <= n; i+=2) {
        //         sum = sum + i;
            
        //     // for (int i=0;i<=n;i++){
        //     // if (i%2!=0){
        //     // sum=sum+i;
        //     // }
        // }
        System.out.println("sum of odd number upto " + n + " is " + sum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the n : ");
        int n = sc.nextInt();
        oddnosum(n);
        sc.close();
    }
}
