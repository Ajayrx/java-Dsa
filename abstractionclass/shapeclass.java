package abstractionclass;
abstract class shape{
    abstract void draw();
}
class circle extends shape{
    void draw(){
        System.out.println("circle");
    }
}

public class shapeclass{
    public static void main(String[] args) {
        shape s=new circle();
        s.draw();
    }
}

