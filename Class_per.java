import java.util.Scanner;
class Per {
    String name;
    String city;
    int age;

    void set_info(String n, String c, int a) {
        name = n;
        city = c;
        age = a;
    }
    void display() {
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("Age: " + age);
    }
}
public class Class_per {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Per p = new Per();
        System.out.print("Enter the name of the person: ");
        String name = sc.nextLine();
        System.out.print("Enter the city of the person: ");
        String city = sc.nextLine();
        System.out.print("Enter the age of the person: ");
        int age = sc.nextInt();
        p.set_info(name, city, age);
        p.display();
    }
}
