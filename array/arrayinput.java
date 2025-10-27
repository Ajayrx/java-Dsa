import java.util.Scanner;

public class arrayinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the Marks Array: ");
        int size = sc.nextInt();
        int marks[] = new int[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the value at mark["+i+"] : ");
            marks[i] = sc.nextInt();
        }

        for (int i=0;i<size;i++){
            System.out.println("Mark at mark["+i+"] : "+marks[i]); 
        }

        sc.close();
    }
}
