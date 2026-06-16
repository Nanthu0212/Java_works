class Car {
    double price;
    String Model;
    Car(String n,double p) {
        Model = n;
        price = p;
        System.out.println("Car created successfully");
    }
}
public class Const_Car {
    public static void main(String[] args){
        Car c1 = new Car("Toyota", 25000.0);
        System.out.println("Model: "+c1.Model);
        System.out.println("Price: "+c1.price);

    }
    
}

