class Book {
    double price;
    String name;
    Book(String n,double p) {
        name = n;
        price = p;
        System.out.println("Book entery created successfully");
    }
}
public class Const_Book {
    public static void main(String[] args){
        Book b1 = new Book("Get In To Java", 799.0);
        System.out.println("NAME : "+b1.name);
        System.out.println("Price: "+b1.price);

    }
    
}

