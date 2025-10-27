// import java.util.*;
// public class triangle {
//     public static void main(String args[]){
//         Scanner scan = new Scanner(System.in);
        
//         int choice;

//         do  {
//             System.out.print("Enter 1 for Triangle & Enter 2 for Inverted Triangle : ");
//             choice = scan.nextInt();

//             if (choice<1){
//                 System.out.println("invalid choice");
//                 break;
//             }
//             System.out.print("\nEnter the length of the TRiangele / Basically height : ");
//             int n = scan.nextInt();

//             switch(choice){

//                 case 1:
//                     for(int i=1;i<=n;i++){
//                         for(int j=1;j<=i;j++){
//                             System.out.print("*");
//                         }
//                         System.out.println();
//                     }
//                      break;

//                 case 2:

//                 for(int i=n;i>=1;i--){
//                     for(int j=1;j<=i;j++){
//                         System.out.print("*");
//                     }
//                     System.out.println();
//                 }
//                 break;

//                 default:
//                     System.out.println("Invalid Choice");
//                 }
//             }while (choice>=1);
        
//             scan.close();
//     }
    
// }
