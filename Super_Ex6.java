class Person {
    String name = "Nanthu";
}

class Employee extends Person {
    int id = 101;

    void display() {
        System.out.println("Name : " + name);
        System.out.println("ID : " + id);
    }
}

public class Super_Ex6 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}