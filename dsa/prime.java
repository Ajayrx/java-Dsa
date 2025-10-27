public class prime {
    public static void main(String[] args) {
        int n=29;
        System.out.print("prime number : ");
        for (int i=1;i<=n;i++){
            int count =0;
            for (int j=1;j<i;j++){
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
