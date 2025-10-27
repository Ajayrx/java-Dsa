import java.util.*;
public class methods {
    public static void main(String args[]){

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the vale of a & b :");
        int a=scan.nextInt();
        int b= scan.nextInt();
        System.out.println("method fetched");
        printjava();
        System.out.println("just checking");
        printsum(a,b);
        scan.close();
    }
    
    public static void printjava(){
        System.out.println("Finally java revising is getting over");
    }

    public static void printsum(int a,int b){
        int sum=a+b;
        System.out.println("sum is = "+ sum);
    }
}
