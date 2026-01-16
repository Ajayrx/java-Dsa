//package constructorsexample;

class employee {
    int empid;
    String empname;

    employee(int id, String name) {
        empid = id;
        empname = name;
    }

    void display() {
        System.out.println(empid + " " + empname);
    }

}

public class parametrizedconstructorexample {
    public static void main(String[] args) {

        employee e1 = new employee(1, "ajay");
        employee e2 = new employee(4, "rahul");
        e1.display();
        e2.display();
    }
}