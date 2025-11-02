public class sumofnaturalno {
    
    public static void main(String args[]){
        int n=5;
        int sum =0;
        System.out.println("Printing sum of natural no");
        printsum(1, n, sum);
    }

    public static void printsum(int i,int n,int sum){
        
        
        if (i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        printsum(i+1, n, sum);
  
    }
}
