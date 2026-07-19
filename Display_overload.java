class Employee{
    void display(){
        System.out.println("Employee detailes are :");
    }
}
public class Display_overload {

    static void display() {
        System.out.println("Employee details are:");
    }

    public static void main(String[] args) {

        Employee E = new Employee();
        E.display();

        display();
    }
}
