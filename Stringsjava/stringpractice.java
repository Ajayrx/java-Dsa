import java.util.*;

public class stringpractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.print("enter size: ");
            int size = sc.nextInt();
            sc.nextLine();

            StringBuilder allstring = new StringBuilder();
            int length = 0;

            for (int i = 0; i < size; i++) {
                String str = sc.nextLine();
                allstring.append(str);
                length += str.length();
            }
            System.out.println("result: " + length);
            System.out.print("Enter 1 for str 0 for exit: ");
            choice = sc.nextInt();

        } while (choice != 0);

        sc.close();
    }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter the no of strings to be enterd: ");
    // int num = sc.nextInt();
    // sc.nextLine();
    // int length = 0;

    // StringBuilder allstring = new StringBuilder();

    // for (int i = 0; i < num; i++) {
    // String str = sc.nextLine();
    // allstring.append(str);
    // length += str.length();

    // }
    // System.out.println("combined length =" + length);
    // sc.close();
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);

    // System.out.print("Enter the no of strings to be entered: ");
    // int num = sc.nextInt();
    // sc.nextLine();

    // int length = 0;

    // String allString[] = new String[num];
    // for (int i = 0; i < num; i++) {
    // allString[i] = sc.nextLine();
    // length += allString[i].length();
    // }
    // System.out.println("Combined length of all String = " + length);

    // sc.close();
    // }
}
