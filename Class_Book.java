import java.util.Scanner;
class Book {
    String title;
    String author;
    double price;

    void set_info(String t, String a, double p) {
        title = t;
        author = a;
        price = p;
    }

    void display() {
        System.out.println("Book Information:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}
public class Class_Book {
    public static void main(String[] args) {
        Book book = new Book();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter book title: ");
        String title = sc.nextLine();

        System.out.print("Enter book author: ");
        String author = sc.nextLine();

        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        book.set_info(title, author, price);
        book.display();
    }
}
