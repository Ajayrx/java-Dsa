import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value at Number[" + i + "] : ");
            arr[i] = sc.nextInt();
        }

        // int max = Integer.MIN_VALUE;
        // int min = Integer.MAX_VALUE;

        // easy approch
        int max=arr[0];
        int min=arr[0];

        for (int i=0;i<size;i++){

            if (arr[i]>max) max=arr[i];
            
            if (arr[i]<min) min=arr[i];
    
        }

        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);

        sc.close();
    }
}
