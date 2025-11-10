public class fibbonaciseries {

    // function
    public static void fiboncai(int a, int b, int c) {
        if (c == 0)
            return;
        System.out.print(a+" ");
        fiboncai(b, a + b, c-1);
    }
    
    // main
    public static void main(String[] args) {
        System.out.print("Fibbonacci series : ");
        fiboncai(0, 1, 7);
    }
}
