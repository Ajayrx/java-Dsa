class shape{
    public void area(){
        System.out.println("Displays area");
    }
}
class triangle extends shape{
    public void area(double a,double b){
        System.out.println("Area of triangle is "+(0.5*a*b));
    }
}
class equilateraltriangle extends triangle{
    public void area(double side){
        System.out.println("Area of Equi triangle is "+(Math.sqrt(3) / 4) * side * side);
    }
}
class circle extends shape{
    public void area(double r){
        System.out.println("area of circle : "+((3.14)*r*r));
    }
}
public class inhere {
    public static void main(String[] args) {
        triangle t=new triangle();
        t.area(3,4);

        equilateraltriangle t1=new equilateraltriangle();
        t1.area(0);

        circle c=new circle();
        c.area(1);
    }
}