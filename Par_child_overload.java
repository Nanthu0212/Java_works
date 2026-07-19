class Vehicle{
    void move(){
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle{
    void move(){
        System.out.println("Car is moving");
    }
}
public class Par_child_overload {
    public static void main(String[] args){
        Vehicle v = new Vehicle();
        v.move();
        Car c = new Car();
        c.move();

    }
}
