class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        //System.out.println("Drawing rectangle");
    }
}

public class dynamicdispatchmethod {
    public static void main(String[] args) {
        
        Shape s = new Circle();
        s.draw();   // Calls Circle's draw()

        s = new Rectangle();
        s.draw();   // Calls Rectangle's draw()
    }
}
