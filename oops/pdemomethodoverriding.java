class parent{
    int mysum(int a,int b){
        System.out.println("with 2 parameters");
        return a+b;
    }
}
class child extends parent{
    @Override int mysum(int a,int b){
        System.out.println("with 3 parameters");
        return a+b+10;
    }
}


public class pdemomethodoverriding {
    public static void main(String[] args) {
        parent sum2=new parent();
        System.out.println("result of parent = "+sum2.mysum(10, 20));
        
        child sum3=new child();
        System.out.println("result with child 10 = "+sum3.mysum(10, 20));

        parent sum4=new child();
        System.out.println("result parent to child = "+sum4.mysum(10, 20));
    }
}
