import java.util.*;
public class tablefuntion {
    public static void printtable(int n){
        if (n<=0){
            System.out.println("invalid table less than or equal to 0");
            return;
        }
        for (int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+i*n);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the table No : ");
        int n = sc.nextInt();
        printtable(n);
        sc.close();
    }
}
