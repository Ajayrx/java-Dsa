class Parent{
    void p(){
        System.out.println("parent top authority");
    }
}

class Child1 extends Parent{
    void doctorson(){
        System.out.println("this son is doctor");
    }
}

class Child2 extends Parent{
    void engineerson(){
        System.out.println("this son is engineer");
    }
}

public class hierarchicalinheritanceexample {
    public static void main(String[] args) {
        Child1 c=new Child1();
        c.doctorson();
        c.p();

        Child2 b=new Child2();
        b.engineerson();
        b.p();
    }
}
