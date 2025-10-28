import java.util.Scanner;

public class powerof2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check whether it is power of 2 : ");
        int n=sc.nextInt();

        if (n>0 && (n&(n-1))==0){
            

            int power=0;
            int temp=n;

            while(temp>1){
                temp=temp/2;
                power++;
            }

            System.out.println("2^"+power+"="+n+" & also power of 2");
        }else
            System.out.println(n+" is Not power of 2");

        sc.close();

    }
}
