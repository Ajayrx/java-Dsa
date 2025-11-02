public class testfactvoid {

    // function void type
    public static void factorial(int n, int fact) {
        if (n == 0 || n == 1) {
            System.out.println("Sum of the factorial = " + fact);
            return;
        }

        factorial(n - 1, fact * n);   // n-1 prints recursion level & fact*n prints factorial value  
        
    }

    // main function
    public static void main(String[] args) {

        int n = 5;
        factorial(n, 1);
    }
}
