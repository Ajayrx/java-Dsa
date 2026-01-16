class parent {
    int my_sum(int a,int b){
        return a+b;
    }
}
class child extends parent{
    @Override int my_sum(int a, int b){
        return a+b+10;
    }
}

public class methodoverriding{
    public static void main(String[] args) {
        parent psum=new parent();
        int result=psum.my_sum(10, 20);
        System.out.println("parent sum = "+result);

        parent csum=new child();
        System.out.println("result of child="+csum.my_sum(10,20));
    }
}
