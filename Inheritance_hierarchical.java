class Vehicle{
    String plate_1 = "TN AU 0934";
    String plate_2 = "TN BH 7840";
    String plate_3 = "TN LS 2094";
    String plate_4 = "TN HK 8593";
}
class Bike extends Vehicle{
    void Show_b(){
        System.out.println("The bikes are ");
        System.out.println(plate_1 +"\n" + plate_3);
    }
}
class Car extends Vehicle{
    void Show_c(){
        System.out.println("The Cars are ");
        System.out.println(plate_2 + "\n" + plate_4);
    }
}
public class Inheritance_hierarchical {
    public static void main(String[] args) {
        Car c = new Car();
        Bike b = new Bike();
        c.Show_c();
        b.Show_b();
    }
    
}
