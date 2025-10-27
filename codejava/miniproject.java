import java.util.*;
public class miniproject {
    public static void main(String args[]){

        int guessnumber = (int)(Math.random()*100);
        Scanner scan = new Scanner(System.in);
        int usernumber;

        do{
            System.out.print("Guess a number from 1 to 100 : ");
            usernumber=scan.nextInt();
            if (usernumber == guessnumber){
                System.out.println("you guessed it");
                break;
            }
            else if(usernumber>guessnumber){
                System.out.println("entered number is too large");
            }
            else {
                System.out.println("entered number is small");
            }
        }while(usernumber>=0);

        System.out.println("random number = "+guessnumber);
        scan.close();
    }
    
}
