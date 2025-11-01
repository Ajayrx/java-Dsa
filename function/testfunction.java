import java.util.*;

public class testfunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to get its factorial: ");
        int n = sc.nextInt();
        System.out.println("Factorial is: " + getFactorial(n));
        sc.close();
    }

    public static int getFactorial(int n) {
        int factorial = 1;
        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
