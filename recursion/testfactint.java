import java.util.Scanner;

public class testfactint {

    // function
    public static int factorial(int n) {

        // for n=0 & 1 check
        if (n == 0 || n == 1)
            return 1;

        // for recursion
        return n * factorial(n - 1);
    }

    // main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find it's Factorial: ");
        int n = sc.nextInt();

        System.out.println("Factorial of " + n + " = " + factorial(n));

        sc.close();
    }
}
