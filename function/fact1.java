import java.util.*;
public class fact1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which factorial need to print : ");
        int n = sc.nextInt();
        printfactorial(n);
        sc.close();
    }

    public static void printfactorial(int n){
        if (n<0){
            System.out.println("invalid");
            return;
        }
        int factorial=1;

        for (int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        System.out.println(" Result is "+factorial);
    }
}
