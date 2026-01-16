public class methodoverloading {
    int my_sum(int a,int b){
        return a+b;
    }
    int my_sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String args[]){
        methodoverloading sum2=new methodoverloading();
        int result=sum2.my_sum(10,20);
        System.out.println("sum2 ="+result);

        methodoverloading sum3=new methodoverloading();
        int result2=sum3.my_sum(10,20,30);
        System.out.println("sum3="+result2);
    }
}
