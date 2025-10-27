import java.util.*;

public class sipralorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of rows and columns ");
        System.out.print("Rows : ");
        int rows = sc.nextInt();
        System.out.print("columns : ");
        int columns = sc.nextInt();

        // input matrix

        int spiralmatrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                spiralmatrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("Spiral matrix output : ");


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
            for(int j=right;j>=left;j--){
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
        // int rowstart = 0;
        // int rowend = rows - 1;

        // int columnstart = 0;
        // int columnend = columns - 1;

        // while (rowstart <= rowend && columnstart <= columnend) {

        // for (int column = columnstart; column <= columnend;column++) {
        // System.out.print(spiralmatrix[rowstart][column] + " ");
        // }
        // rowstart++;

        // for (int row = rowstart; row <= rowend; row++) {
        // System.out.print(spiralmatrix[row][columnend] + " ");
        // }
        // columnend--;

        // for (int column = columnstart;column<=columnend;column++){
        // System.out.print(spiralmatrix[column][rowstart]);
        // }

