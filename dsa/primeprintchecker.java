import java.util.*;

public class primeprintchecker {
    public static boolean isprime(int n) {
        if (n <= 1)
            return false;
        if (n == 2 || n == 3)
            return true;
        if (n % 2 == 0 || n % 3 == 0)
            return false;

        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter 1 for Prime check || 2 for Prime No print upto n");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.print("enter the number to check : ");
                int n = sc.nextInt();
                System.out.println(isprime(n) ? n + " is prime" : n + " is not prime");
                break;

            case 2:
                System.out.print("enter the number upto which it need to be print : ");
                int pn = sc.nextInt();
                System.out.println("Printing no upto : " + pn);
                for (int i = 2; i <= pn; i++) {
                    if (isprime(i))
                        System.out.print(i + " ");
                }
                System.out.println();
                break;

            default:
                System.out.println("invalid choice");
        }
        sc.close();
    }
}
