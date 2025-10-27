class student{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println("Name : " +name);
    }

    public void printinfo(int age){
        System.out.println("Age : "+age);
    }

    public void printinfo(String name, int age){
        System.out.println("Name : " + name +" || age : "+age);
    }
}
public class poly {
    public static void main(String[] args) {
        student s1=new student();
        s1.name="ajay";
        s1.age=23;

        s1.printinfo(s1.name,s1.age);
        s1.printinfo(s1.name);
        s1.printinfo(s1.age);
    }
}
