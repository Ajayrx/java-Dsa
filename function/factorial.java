import java.util.*;

public class factorial {
    public static int printfactorial(int n){
        int factorial=1;
        for (int i=n;i>=1;i--){
            factorial=factorial*i;
        }
        //System.out.println(factorial);   
        return factorial;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to gets its factorial : ");
        int n = sc.nextInt();
        System.out.println("factorial is : " + printfactorial(n));
        sc.close();
    }

    
}
