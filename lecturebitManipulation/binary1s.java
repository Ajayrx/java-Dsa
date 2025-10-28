import java.util.Scanner;

public class binary1s {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        int count=0;
        int temp=n;

        while(temp>0){
            temp=temp&(temp-1);
            count++;
        }
        System.out.println("result is "+count);

        sc.close();
    }
}
