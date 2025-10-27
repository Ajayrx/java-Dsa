import java.util.Scanner;

public class maxminarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value at Number[" + i + "] : ");
            number[i] = sc.nextInt();
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i=0;i<size;i++){

            if (number[i]>max) max=number[i];
            
            if (number[i]<min) min=number[i];
    
        }

        System.out.println("Max value is "+max);
        System.out.println("Min value is "+min);

        sc.close();
    }
}
