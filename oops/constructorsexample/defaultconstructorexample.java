//package constructorsexample;
class student {
    int id;
    String name;

    student() {
        id = 0;
        name = "n/a";
    }

    void display() {
        System.out.println(id + " " + name);
    }

}

public class defaultconstructorexample {
    public static void main(String[] args) {
        student s = new student();
        s.display();
    }
}