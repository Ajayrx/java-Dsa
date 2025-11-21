import java.util.*;

public class transposeexp {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Rows: ");
        int rows=sc.nextInt();
        System.out.print("Columns: ");
        int columns=sc.nextInt();

        int orginalmatrix[][]=new int[rows][columns];
        System.out.println("orginal Matrix Input");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print("for ("+i+","+j+"): ");
                orginalmatrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("orginal Matrix output");
        for (int i=0;i<rows;i++){
            for (int j=0;j<columns;j++){
                System.out.print(orginalmatrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("transpose Matrix output---- experiment");
        for (int i=0;i<columns;i++){
            for (int j=0;j<rows;j++){
                System.out.print(orginalmatrix[j][i]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
