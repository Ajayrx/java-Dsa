public class rombustriangle {
    public static void main(String[] args) {
        int n=5;
        for (int i=n;i>=1;i--){
            for (int j=1;j<i;j++){
                System.out.print(" ");
            }
            for (int k=0;k<=n-i;k++){
                System.out.print("0");
            }
            for (int m=1;m<i;m++ ){
                System.out.print("0");
            }
            System.out.println();
        }
    }
}
