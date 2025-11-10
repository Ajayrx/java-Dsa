public class testcalpower {

    public static int calpower(int x, int n) {
        if (n == 0)
            return 1;
        return x * calpower(x, n - 1);
    }

    public static void main(String[] args) {
        int result =calpower(2, 5);
        System.out.println("answer "+result);
    }
}
