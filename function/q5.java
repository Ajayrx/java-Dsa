// Write a function that takes in age as input and 
// returns if that person is eligible to vote or not. 
// A person of age > 18 is eligible to vote.

import java.util.Scanner;

public class q5 {
    // public static int age(int n){
        
    //         return (n>=18)? 1:0;
    // }

    public static boolean eliglibletovote(int age){
        return age >= 18;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int n = sc.nextInt();
        
        if (eliglibletovote(n)){
            System.out.println(" Adult");
        }else{
            System.out.println("NOt Adult");
        }
        
        sc.close();
    }
    // public static void main(String[] args) {
    //     Scanner sc = new Scanner(System.in);
    //     System.out.print("Enter age: ");
    //     int n = sc.nextInt();
    //     int result=age(n);
    //     if (result==1){
    //         System.out.println(" Adult");
    //     }else{
    //         System.out.println("NOt Adult");
    //     }
        
    //     sc.close();
    // }
}
