class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(float h, float b) {
       System.out.println((0.5f)*b*h);
   }  
}
class Circle extends Shape {
   public void area(int r) {
       System.out.println((3.14)*r*r);
   }  
}
public class runpoly{
    public static void main(String[] args) {
        // Shape s=new Shape();
        float h=5;
        float b=7;
        int r=2;

        Circle c=new Circle();
        c.area(r);

        Triangle t=new Triangle();
        t.area(h,b);
    }
}