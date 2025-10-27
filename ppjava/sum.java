// Wap a program to display the sum of 1 to n numbers 

import java.util.*;
public class sum
{
    public static void main(String[] args)
    {
        System.out.print("Enter the value of N : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        
        int result = (n*(n+1))/2;

        System.out.println("Sum of N numbers from ! to N = "+result);
        sc.close();
    }
}