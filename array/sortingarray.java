import java.util.*;

public class sortingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int order[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the of order at order[" + i + "] : ");
            order[i] = sc.nextInt();
        }

        boolean isascending = true;

        for (int i = 0; i < size - 1; i++) {
            if (order[i] > order[i + 1]) {
                isascending = false;
                break;
            }
        }
        System.out.print("Array order: [");
        for (int i = 0; i < size; i++) {
            System.out.print(order[i]);
            if (i != size - 1)
                System.out.print(",");
        }
        System.out.print("]  ");

        if (isascending) {
            // System.out.print("[");
            // for (int i=0;i<size;i++){
            // System.out.print(order[i]+",");
            // }

            System.out.println("Sorted");
        } else {
            System.out.println("Unsorted");
        }

        sc.close();
    }
}
