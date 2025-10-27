import java.util.*;
public class dowhileloop {
    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);
        
        int n;
        do{
            System.out.print("enter your number: ");
            n = scan.nextInt();
            
            if (n>0){
                for(int j=n;j>0;j--){
                    System.out.print(j+" ");
                }
                System.out.println();
            }
        }while(n>0);

        System.out.println("End");



        scan.close();
    }
    
}
