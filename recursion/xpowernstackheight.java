
public class xpowernstackheight {

    // function to calculate x^n
    public static int power(int x, int n) {
        if (n == 0) return 1; // base case

        int smallAns = power(x, n - 1); // recursive call (stack height = n)
        int ans = x * smallAns;

        return ans;
    }

    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        System.out.println(x + "^" + n + " = " + power(x, n));
    }
}
