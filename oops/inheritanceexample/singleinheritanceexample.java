// class parent {
//     void show(){
//         System.out.println("parent class");
//     }
// }
// class child extends parent{
//     void display(){
//         System.out.println("child class");
//     }
// }
// public class singleinheritanceexample{
//     public static void main(String[] args) {
//         parent p=new parent();
//         p.show();

//         child c=new child();
//         c.display();
//     }

// }

class Animal{
    void eat(){
        System.out.println("all animals eat food");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("dogs barks");
    }
}

public class singleinheritanceexample{
    public static void main(String[] args) {
        

        Dog b=new Dog();
        b.bark();
        b.eat();
    }
}



    

