import java.util.Scanner;

public class bitaposition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the no. : ");
        int n = sc.nextInt();

        System.out.print("ENter the pos to toggle : ");
        int pos = sc.nextInt();

        int result = n^(1<<pos);
        System.out.println("Result is : "+result);


        sc.close();
    }
}
