public class printnumber {

    public static void printnum(int n) {
        if (n == 6)
            return;
        System.out.println(n);
        printnum(n + 1);
    }

    public static void printnumrev(int n) {
        if (n == 0)
            return;

        System.out.println(n);
        printnumrev(n - 1);
    }

    public static void main(String[] args) {
        int n = 1;
        int x = 5;
        System.out.println("printing numbers 1-5");
        printnum(n);
        System.out.println("printing numbers 5-1");
        printnumrev(x);
    }

}
