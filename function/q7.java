// Write a program to enter the numbers till the user wants and 
// at the end it should display the count of positive, negative and zeros entered. 

import java.util.*;

public class q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Press 1 to continue & 0 to stop : ");
        int choice = sc.nextInt();

        int zero = 0, positive = 0, negative = 0;

        while (choice == 1) {
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            if (n > 0) {
                positive++;
            } else if (n < 0) {
                negative++;
            } else {
                zero++;
            }
            System.err.println("enter 1 to continue or 0 to exit");
            choice = sc.nextInt();
        }
        System.out.println("Positives : " + positive);
        System.out.println("Negatives : " + negative);
        System.out.println("Zeros : " + zero);

        sc.close();
    }
}
