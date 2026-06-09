import java.util.Scanner;
class Circle {
    double radius;

    void set_radius(double r) {
        radius = r;
    }

    void Calculate_area() {
        System.out.println("Area of the circle: " + (3.14 * radius * radius));
    }
}
public class Class_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c = new Circle();
        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();
        c.set_radius(radius);
        c.Calculate_area();
    }
    
}
