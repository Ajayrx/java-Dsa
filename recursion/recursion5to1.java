public class recursion5to1 {
    public static void main(String[] args) {

        int n = 5;
        int sum = 0;
        printnsum(1, n, sum);
    }

    public static void printnsum(int i, int n, int sum) {
        if (i == n) {
            sum += i;
            System.out.println(sum);
        }
        sum += i;
        printnsum(i + 1, n, sum);
    }
}

// public class recursion5to1 {
// public static void main(String[] args) {
// int n = 1;
// printnum(n);
// }

// public static void printnum(int n) {
// if (n == 6)
// return;
// System.out.println(n);
// printnum(n+1);
// }
// }
