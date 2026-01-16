class Grandparent{
    void old(){
        System.out.println("grandparent");
    }
}
class Parent extends Grandparent{
    void young(){
        System.out.println("parent");
    }
}
class Child extends Parent{
    void kid(){
        System.out.println("son");
    }
}


public class multilevelinheritanceexample {
    public static void main(String[] args) {
        Child c=new Child();
        c.old();
        c.young();
        c.kid();
    }
}
