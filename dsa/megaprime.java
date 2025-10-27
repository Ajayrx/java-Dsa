public class megaprime {
    public static void main(String[] args) {
        System.out.print("prime number = ");
        int n=29;
        for (int i=3;i<=n;i++){
            int count=0;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    count++;
                    break;
                }
            }
            if (count==0){
                System.out.print(i+" ");
            }
        }
    }
}
