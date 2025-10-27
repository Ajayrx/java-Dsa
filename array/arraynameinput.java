// Take an array of names as input from the user and print them on the screen.

import java.util.*;
public class arraynameinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of string array : ");
        int size = sc.nextInt();
        sc.nextLine();  // clears all leftover lines

        String names[] = new String[size];

        for (int i=0;i<size;i++){
            System.out.print("Enter the name at name["+i+"] : ");
            names[i]=sc.nextLine();
        }

        for (int i=0;i<size;i++){
            System.out.println("name at name["+i+"] : "+names[i]);
        }

        sc.close();
    }
}
