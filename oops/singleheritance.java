class SingleInheritance {
    void show() {
        System.out.println("This is parent class");
    }
}

class Child extends SingleInheritance {
    void display() {
        System.out.println("This is child class");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        obj.show();
        obj.display();
    }
}
