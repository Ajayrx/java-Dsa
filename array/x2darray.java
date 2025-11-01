import java.util.*;

public class x2darray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the no of columns: ");
        int columns = sc.nextInt();

        int matrix[][] = new int[rows][columns];

        // input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("matrix at [" + i + "," + j + "] : ");
                matrix[i][j] = sc.nextInt();
            }
        }

        // search input
        System.out.println("Enter the value to be search: ");
        int x = sc.nextInt();

        boolean found = false;
        // output
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {

                if (matrix[i][j] == x){
                    System.out.print("found at index row " + i + " & column " + j);
                    found = true;
                    break;
                }        
            }
            //System.out.println();
        }

        if (!found) {
            System.out.println(" Not found");
        }

        sc.close();
    }
}
