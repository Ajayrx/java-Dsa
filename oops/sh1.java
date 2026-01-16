public class sh1 {
    void show(){
        System.out.println("this is parent class");
    }

}
 class child extends sh1{
    void dsiplay(){
        System.out.println("this is child class");
    }

    public static void main(String[] args) {
        child obj=new child();
        obj.show();
        obj.dsiplay();
    }
 }