public class pdemomethodoverloading {
    int mysum(int a, int b) {
        System.out.println("with 2 parameters");
        return a + b;
    }

    int my_sum(int a, int b, int c) {
        System.out.println("with 3 parameters");
        return a + b + c;
    }

    public static void main(String[] args) {
        pdemomethodoverloading sum2 = new pdemomethodoverloading();
        System.out.println("result sum2 = " + sum2.mysum(10, 20));

        pdemomethodoverloading sum3 = new pdemomethodoverloading();
        System.out.println("result sum3 = " + sum3.my_sum(10, 20, 30));
    }
}
