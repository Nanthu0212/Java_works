import java.util.Scanner;
class Mobil {
    String brand;
    double price;

    void set_info(String b, double p) {
        brand = b;
        price = p;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}
public class Class_Mobil {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mobil m1 = new Mobil();
        System.out.print("Enter the brand of the mobile: ");
        String brand = sc.nextLine();
        System.out.print("Enter the price of the mobile: ");
        double price = sc.nextDouble();
        m1.set_info(brand, price);
        m1.display();
        Mobil m2 = new Mobil();
        System.out.print("Enter the brand of the second mobile: ");
        brand = sc.nextLine();
        System.out.print("Enter the price of the second mobile: ");
        price = sc.nextDouble();
        m2.set_info(brand, price);
        m2.display();
    }
}
