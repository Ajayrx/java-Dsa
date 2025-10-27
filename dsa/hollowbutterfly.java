public class hollowbutterfly {
    public static void main(String[] args) {
        int n=5;
        for (int i=1;i<=2*n;i++){
            // row control
            int row = i<=n ? i:2*n-i+1;

            // left wing
            for (int j=1;j<=row;j++){
                if (j==1 || j==row){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }

            // middle space
            for (int j=1;j<=2*(n-row);j++){
                System.out.print(" ");
            }

            // right wing
            for (int j=1;j<=row;j++){
                if (j==1 || j==row){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 

// // left wing
//             for (int j=1;j<=i;j++){
//                 if (j==1 || j==i){
//                     System.out.print("*");
//                 }else {
//                     System.out.print("_");
//                 }
//             }

//             // middle space
//             for (int j=1;j<=2*(n-i);j++){
//                 System.out.print(" ");
//             }

//             // right wing
//             for (int j=1;j<=n;j++){
//                 if (j==1 || j==i){
//                     System.out.print("*");
//                 }else{
//                     System.out.print(" ");
//                 }
//             }
