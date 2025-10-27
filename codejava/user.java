import java.util.*;
public class user {
    public static void main(String args[]) {
         
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your Cash");
        double cash = scan.nextDouble();
        
        // --------------------- low logic --------------------
        // if (cash < 10) {
        //     System.out.println("you cant buy anything");
        // }
        // else if (cash <= 10 || cash < 50){
        //     System.out.println("you can buy pencil");
        // }
        // else if (cash <= 50 || cash > 50){
        //     System.out.println("you can buy both");
        // }

        // --------------------- high logic --------------------
        // if (cash < 10) {
        //     System.out.println("you can not buy anything");
        // }
        // else if (cash < 40) {
        //     System.out.println("you can buy pencil");
        // }
        // else if (cash < 50) {
        //     System.out.println("you can buy pencil or pen");
        // }
        // else {
        //     System.out.println("you can buy both ");
        // }

        // --------------------- top logic --------------------
        String message = (cash < 10) ? "you can not buy anything" : 
                         (cash < 40) ? "you can buy pencil" : 
                         (cash < 50) ? "you can buy pencil or pen" : 
                                       "you can buy both";

        System.out.println(message);
        System.out.println("Your cash is: " + cash);

        scan.close();
    }
    
}
