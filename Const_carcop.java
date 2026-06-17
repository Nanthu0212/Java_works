class Car {
    double price;
    String Model;
    Car(String n,double p) {
        Model = n;
        price = p;
        System.out.println("Car created successfully");
    }
    Car(Car c){
        this.Model = c.Model;
        this.price = c.price;
        System.out.println("Copy data is created sucessfully ");
    }
}
public class Const_carcop {
    public static void main(String[] args){
        Car c1 = new Car("Toyota", 25000.0);
        Car c2 = new Car (c1);
        System.out.println("Model: "+c1.Model);
        System.out.println("Price: "+c1.price);
        System.out.println("Copy Model: "+c2.Model);
        System.out.println("Copy Price: "+c2.price);
    }
    
}

