public class butt {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<2*n;i++){
            int row = i<=n ? i : 2*n-i;   // 1 to 5 next for i=6 run 5-1

            for (int j=1;j<=row;j++){
                System.out.print("*");
            }
            for (int j=1;j<=2*(n-row);j++){
                System.out.print(" ");
            }
            for (int j=1;j<=row;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
