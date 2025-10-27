public class pailandromepattern {
    public static void main(String[] args) {
        int n=5;
        for (int i =1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("_");
            }
            for (int j=i;j>=1;j--){
                System.out.print(j);
            }
            for (int j=2;j<=i;j++){
                System.out.print("hello");
                
                
            }
            
            System.out.println();
        }
    }
}


