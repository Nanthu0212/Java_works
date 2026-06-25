class Parent {
    String name = "Nanthu";
    void display() {
        System.out.println("The name of the parent is : " + name);
    }
}

class Child extends Parent {
    String name = "Kishore";

    void display() {
        System.out.println("The name of the child is : " + name);
        super.display();
        
    }
}

public class Super_Ex2 {
    public static void main(String[] args) {
        Child c = new Child();
        c.display();
        

    }
}