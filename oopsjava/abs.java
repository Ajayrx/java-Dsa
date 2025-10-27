public class abs {
    public static void main(String[] args) {
        chicken c=new chicken();
        c.walk();
        horse h=new horse();
        h.walk();

    }
}

abstract class animal{
    abstract void walk();
}

class horse extends animal{

    horse(){
        System.out.println("running");
    }
    public void walk(){
        System.out.println("walk on 4 legs");
    }

    
}

class chicken extends animal{
    public void walk(){
        System.out.println("walk on 2 legs");
    }
}