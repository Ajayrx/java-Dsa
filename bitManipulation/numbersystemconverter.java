import java.util.Scanner;

public class numbersystemconverter {


    public static String decimaltobinary(int n){
        return Integer.toBinaryString(n);
    }

    public static int binarytodecimal(String a){
        return Integer.parseInt(a,2 );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number to convert decimal to binary: ");
        int decimal=sc.nextInt();
        String binary=decimaltobinary(decimal);
        System.out.println("demicmal to binary "+ binary);

        System.out.println("================");
        System.out.print("enter the number to convert binary to decimal:");
        String binaryinput=sc.next();
        int decimaloutput=binarytodecimal(binaryinput);
        System.out.println("binary to decimal "+decimaloutput);
        sc.close();
    }
}
