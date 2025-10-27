import java.util.Scanner;

public class ppsipralorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Values of Rows & Columns");
        System.out.print("Rows: ");
        int rows=sc.nextInt();
        System.out.print("Columns: ");
        int columns=sc.nextInt();

        int spiralmatrix[][] = new int[rows][columns];
        // matrix Input
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("for ("+i+","+j+") : ");
                spiralmatrix[i][j]=sc.nextInt();
            }
        }


        System.out.print("The Spiral Order Matrix : ");

        // approch = left - right || top - buttom || right - left || buttom - top

        int top=0,buttom=rows-1;
        int left=0,right=columns-1;

        while (top<=buttom && left<=right) {

            // left - right
            for (int j=left;j<=right;j++){
                System.out.print(spiralmatrix[top][j]+" ");
            }
            top++;

            // top - buttom
            for (int i=top;i<=buttom;i++){
                System.out.print(spiralmatrix[i][right]+" ");
            }
            right--;

            // right - left
            for (int j=right;j>=left;j--){
                System.out.print(spiralmatrix[buttom][j]+" ");
            }
            buttom--;

            // buttom - top
            for (int i=buttom;i>=top;i--){
                System.out.print(spiralmatrix[i][left]+" ");
            }
            left++;         
        }

        sc.close();
    }
}
