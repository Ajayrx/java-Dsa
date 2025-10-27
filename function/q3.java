// Write a function which takes in 2 numbers and returns the greater of those two.

import java.util.*; 
public class q3 {

    public static int greatoftwo(int a,int b){
        // if (a>b){
        //     System.out.println(a +" is Greater");
        //     return;
        // }else{
        //     System.out.println(b+" is Greater");
        //     return;
        // }
        // System.out.println(a>b ? a +" is Greater" : b +" is Greater");
        

        // return (a > b) ? a : (a < b) ? b : a;

        return Math.max(a,b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two numbers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Greater number is: "+ greatoftwo(a, b));
        sc.close();
    }
}
