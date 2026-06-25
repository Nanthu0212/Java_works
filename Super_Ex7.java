class GrandParent {
    void grand() {
        System.out.println("GrandParent");
    }
}

class Parent extends GrandParent {
    void parent() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    void child() {
        System.out.println("Child");
    }
}

public class Super_Ex7 {
    public static void main(String[] args) {
        Child c = new Child();
        c.grand();
        c.parent();
        c.child();
    }
}