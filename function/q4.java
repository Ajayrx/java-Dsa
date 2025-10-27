// Write a function that takes in the radius as input and returns the circumference of a circle.
import java.util.*;
public class q4 {
    // public static double circumference(double n){
    //     return 2*Math.PI*n;
        
    // }

    public static void circumference(double r){
        double circumference=2*Math.PI*r;
        System.out.println("Circumference of the circle is : "+ circumference);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius : ");
        double n = sc.nextDouble();
        circumference(n);
        sc.close();
    }
}
