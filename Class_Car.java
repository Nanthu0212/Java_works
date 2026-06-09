import java.util.Scanner;
class Car {
    String brand;
    String model;
    int price;

    void set_info(String b, String m, int p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Car Information:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class Class_Car {
    public static void main(String[] args){
        Car car1 = new Car();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();
        System.out.print("Enter car model: ");
        String model = sc.nextLine();
        System.out.print("Enter car price: ");
        int price = sc.nextInt();
        car1.set_info(brand, model, price);
        car1.display();
    }
}
