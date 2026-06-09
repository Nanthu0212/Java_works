import java.util.Scanner;
class Lap {
    String brand;
    int ram;
    double price;

    void set_info(String b, int r, double p) {
        brand = b;
        ram = r;
        price = p;
    }
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Price: " + price);
    }
}
public class Class_lap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Lap l = new Lap();
        System.out.print("Enter the brand of the laptop: ");
        String brand = sc.nextLine();
        System.out.print("Enter the RAM of the laptop: ");
        int ram = sc.nextInt();
        System.out.print("Enter the price of the laptop: ");
        double price = sc.nextDouble();
        l.set_info(brand, ram, price);
        l.display();
    }
    
}
