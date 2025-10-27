// Write a function that calculates the Greatest Common Divisor of 2 numbers. (BONUS)

import java.util.Scanner;

public class q9 {
    public static int gcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;

            } else {
                b = b - a;

            }

        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b = sc.nextInt();
        System.out.println("Gcd " + gcd(a, b));

        sc.close();
    }
}
