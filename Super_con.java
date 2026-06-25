class Car{
    String name;
    Car(String name){
        this.name = name;
        
    }
}
class Info_car extends Car{
    String name;
    int price;
    Info_car(String name,int price){
        super(name);
        this.name = name;
        this.price = price;
    }
}
public class Super_con {
    public static void main(String[] args) {
        Info_car i = new Info_car("BMW" , 200000);
        System.out.println("The name of the car :" + i.name);
        System.out.println("The price of the car is : "+ i.price);
        
    }
    
}
