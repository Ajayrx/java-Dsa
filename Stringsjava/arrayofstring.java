// Take an array of Strings input from the user & find the cumulative (combined) length of all those strings

import java.util.Scanner;

public class arrayofstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total no of String to be Entered : ");
        int size=sc.nextInt();
        sc.nextLine();

        int length=0;
        StringBuilder allstrings = new StringBuilder();

        for (int i=0;i<size;i++){
            String str=sc.nextLine();
            allstrings.append(str);
            length+=str.length();
        }

        // String strings[] = new String[size];
        // for (int i=0;i<size;i++){
        //     strings[i]=sc.nextLine();
        //     length+=strings[i].length();
        // }
        System.out.println("Combined length is "+length);

        sc.close();
    }
}
