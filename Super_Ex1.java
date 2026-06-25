class Parent {
    String name = "Nanthu";
}

class Child extends Parent {
    String name = "Kishore";

    void display() {
        System.out.println("The name of the child is : " + name);
        System.out.println("The name of the parent is : " + super.name);
    }
}

public class Super_Ex1 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
    }
}