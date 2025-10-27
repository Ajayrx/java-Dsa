public class test2 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= n; z++) {
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
