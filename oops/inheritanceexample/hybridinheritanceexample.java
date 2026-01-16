interface Animal{
    void eat();   
}

interface Bird extends Animal{
    void fly();
}
interface Mammals extends Animal{
    void noeggs();
}
class Bat implements Bird,Mammals{

    public void eat(){
        System.out.println("animals eat");
    }

    public void fly(){
        System.out.println("all bird fly");
    }

    public void noeggs(){
        System.out.println("mammals dont lay eggs");
    }

}
public class hybridinheritanceexample {
    public static void main(String[] args) {
        Bat b=new Bat();
        b.eat();
        b.fly();
        b.noeggs();
    }
}
