public class sumofnaturalno {
    
    public static void main(String args[]){
        int n=6;
        int sum =0;
        System.out.println("Printing sum of natural no");
        printsum(1, n, sum);
    }

    public static void printsum(int i,int n,int sum){
        
        
        if (i==n){
            sum+=i;
            System.out.println("hello"+sum);
            return;
        }
        sum+=i;
        System.out.println("jkk");
        printsum(i+1, n, sum);
  
    }
}
