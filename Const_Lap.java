class Laptop {
    double price;
    String Company;
    Laptop(String n,double p) {
        Company = n;
        price = p;
        System.out.println("Laptop created successfully");
    }
}
public class Const_Lap {
    public static void main(String[] args){
        Laptop l1 = new Laptop("Dell", 50000.0);
        System.out.println("Company: "+l1.Company);
        System.out.println("Price: "+l1.price);

    }
    
}

