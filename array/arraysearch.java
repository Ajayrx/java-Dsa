import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Array: ");
        int size = sc.nextInt();
        int number[] = new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the value at Number["+i+"] : ");
            number[i] = sc.nextInt();
        }

        System.out.print("Enter the number to be searched: ");
        int x = sc.nextInt();

        System.out.println("Number to be searched is : "+x);

        boolean found = false;

        for (int i=0;i<size;i++){
            if (number[i]==x){
                System.out.println("Number found at index : "+i);
                found = true;
                break;
            }
        }

        if (!found){
            System.out.println("Invalid Search");
        }

        sc.close();
    }
}