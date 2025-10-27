import java.util.Scanner;

public class transpose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the values of ROWS && COLUMNS ");
        System.out.print("ROWS : ");
        int rows = sc.nextInt();
        System.out.print("CLOUMNS : ");
        int columns = sc.nextInt();

        // input matrix
        int orginalmatrix[][] = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("for (" + i + "," + j + ") : ");
                orginalmatrix[i][j] = sc.nextInt();
            }
        }

        // Original matrix swapping to Transpose matrix  
        int transpose[][] = new int[columns][rows];

        System.out.println(" Tranpose matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transpose[j][i] = orginalmatrix[i][j];
            }
        }

        // original matrix output
        System.out.println(" orginal matrix : ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(orginalmatrix[i][j] + " ");
            }
            System.out.println();
        }

        // Transpose Matrix output
        System.out.println("Transpose matrix : ");
        for (int i=0;i<columns;i++){
            for (int j=0;j<rows;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

        sc.close();
    }
}
