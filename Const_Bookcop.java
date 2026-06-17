class Book {
    String title;
    double price;
    String name;
    Book(String t, String n,double p) {
        title = t;
        name = n;
        price = p;
        System.out.println("Book entery created successfully");
    }
    Book(Book b){
        this.title = b.title;
        this.name = b.name;
        this.price = b.price;
    }
}
public class Const_Bookcop {
    public static void main(String[] args){
        Book b1 = new Book("Get In To Java","author", 799.0);
        Book b2 = new Book(b1);
        b2.price= 1200;
        System.out.println("Name entery 1 : "+b1.name);
        System.out.println("Title entery 1 : "+b1.title);
        System.out.println("Price entery 1 : "+b1.price);
        System.out.println("Name entery 2 : "+b2.name);
        System.out.println("Title entery 2 : "+b2.title);
        System.out.println("Price entery 2 : "+b2.price);

    }
    
}

