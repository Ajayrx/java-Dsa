public class breackcontinue {
    public static void main(String args[]){

        int n=0;
        while(true){
            if(n==3){
                n=n+1;
                continue;
            }
            System.out.println(n);
            n=n+1;
            if(n>5){
                break;
            }
        }
    }   
}
