import java.util.*;

public class Logic71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int zero=0,positive=0,negative=0;
        int choice;

        do{

            
            int n;

            while(true){
                System.out.print("Enter a number ");
                if (sc.hasNextInt()){
                    n=sc.nextInt();
                    break;

                }else{
                    System.out.println("invalid");
                    sc.next();
                }
            }
            

            // if(!sc.hasNextInt()){
            //     System.out.println("Invalid token");
            //     sc.next();
            // }
            // int n=sc.nextInt();
            // int n=readInt(sc,"enter a number: ");

            if (n>0) positive++;
            else if (n<0) negative++;
            else zero++;

            while (true) {
                System.out.print("Enter your choice 1 to continue or 0 to stop: ");
                if (sc.hasNextInt()){
                    choice=sc.nextInt();
                    if (choice==0 || choice==1){
                        break;
                    }else{
                        System.out.println("Enter 1 or 0");
                    }
                }else{
                    System.out.println("Invalid input! Please enter 1 or 0.");
                    sc.next();
                }
            }

            

        }while(choice==1);

        System.out.println("positive: "+positive);
        System.out.println("negaitive: "+negative);
        System.out.println("Zero: "+zero);

        sc.close();
    }
}
