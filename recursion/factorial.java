public class factorial {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(factoreal(n));
    }

    public static int factoreal(int n) {
        if (n==0){
            //System.out.println("sum = "+n);
        return 0;
        }
        
        if (n==1){
            //System.out.println("sum = "+n);
        return 1;
        }

        // int nextfactor=factoreal(n - 1);
        // int facti =n*nextfactor;
        // System.out.println(facti);
        
        return n*factoreal(n-1);
    }
}
