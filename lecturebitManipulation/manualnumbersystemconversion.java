import java.util.Scanner;

public class manualnumbersystemconversion {

    
    // Decimal to Binary Function

    public static String decimaltobinary(int decimalinput) {
        // return Integer.toBinaryString(n);

        if (decimalinput == 0)
            return "0";

        StringBuilder binary = new StringBuilder();

        while (decimalinput > 0) {
            int remainder = decimalinput % 2;
            binary.append(remainder);
            decimalinput /= 2;
        }
        return binary.reverse().toString();

    }

    // Binary to Decimal Function

    public static int binarytodecimal(String binaryinput){
        // return Integer.parseInt(binaryinput,2);

        int decimal=0;
        int power=0;

        for (int i=binaryinput.length()-1;i>=0;i--){
            if (binaryinput.charAt(i)=='1'){
                //decimal += Math.pow(2, power);
                decimal += (1<<power);       //bit shifting is perfect for powers of 2

            }
            power++;
        }
        return decimal;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Decimal to Binary converter your value: ");
        int decimalinput = sc.nextInt();
        System.out.println("Decimal to binary : " + decimaltobinary(decimalinput));

        System.out.println("=====================");

        System.out.print("Binary to Decimal converter your value: ");
        String binaryinput = sc.next();
        System.out.println("Binary to Decimal : " + binarytodecimal(binaryinput));

        sc.close();
    }
}
