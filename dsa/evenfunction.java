import java.util.*;
public class evenfunction {
    public static boolean evennocheck(int n){
        if (n<=0){
            System.out.println("invalid");
            return false;
        }
        if (n==1){
            System.out.println("nor prime nor composite");
            return false;
        }
        if (n%2==0){
            System.out.println(n+" is Even");
            return true;
        }
            
        else{
            System.out.println(n+" is Odd");
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to be checked : ");
        int n= sc.nextInt();
        evennocheck(n);
        sc.close();

    }
}
