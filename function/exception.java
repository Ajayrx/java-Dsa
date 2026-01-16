public class exception {
    public static void main(String[] args) {
        
        try{
            int a=10/0;
            System.out.println("Answer = "+a);
        }catch(ArithmeticException e){
            System.out.println("zero divisible error");}
        // }finally{
        //     System.out.println("executed");
        // }
    }
}
