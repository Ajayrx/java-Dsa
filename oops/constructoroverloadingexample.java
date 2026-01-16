
class Parent {
   void show() {
      System.out.println("Parent");
   }
}
class Child extends Parent {
   void show() {
      System.out.println("Child");
   }
}
public class constructoroverloadingexample{
   public static void main(String[] args) {
      Parent p = new Child();
      Parent c=new Child();
      c.show();
      p.show();
   }
}


