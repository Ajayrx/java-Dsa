import java.util.*;
public class input {
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);

        // System.out.print("Enter your age:");
        // int age = scan.nextInt();
        // System.out.println("Your age is: " + age );

        // scan.nextLine();
        
        System.out.print("Enter your name:");
        String name = scan.nextLine();
        // System.out.println("Your name is: " + name);

        System.out.print("Enter your full name:");
        String name1 = scan.nextLine();
        System.out.println("Your name is: " + name1);

        System.out.println("Your name is: " + name);
        scan.close();
    }
    
}
