import java.util.*;

public class menustu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int choice;
        do{
            System.out.println("Enter 1 for student mark & 0 for exit");
            choice=sc.nextInt();

            if (choice==1){
                System.out.println("Enter the mark btw (0 t0 100) : ");
                int mark=sc.nextInt();

                if (mark>=90 && mark<=100){
                    System.out.println("This is Good");
                }
                else if (mark>=60 && mark<=89){
                    System.out.println("This is also Good");
                }
                else if (mark>=0 && mark<=59){
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don’t matter but our effort does");
                }
                else {
                    System.out.println("Invalid marks!");
                }
            }else if (choice!=0){
                System.out.println("enter a vaild choice 1 0r 0");
            }
        
        }while(choice!=0);
        System.out.println("Prgram exited");
        sc.close();

    } 

}
