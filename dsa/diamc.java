public class diamc {
    public static void main(String[] args) {
        int n=5;

        for (int i=1;i<=2*n;i++){

            int row= i<=n ? i:2*n-i; // logic to be needed

            for (int j=1;j<=n-row;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=2*row-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
