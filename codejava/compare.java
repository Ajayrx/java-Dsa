import java.util.*;
public class compare {
    public static void main(String args[]){

        // comprasion operators
        // ==, !=, >, <, >=, <=
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the value of a and b");

        int a= scan.nextInt();
        int b=scan.nextInt();

        if (a>b)
            System.out.println("a is greater than b");
        else 
            System.out.println("a is not greater than b");

        scan.close();
    }
    
}
