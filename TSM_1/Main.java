import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Bill bill = new Bill();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Tea Stall!");

        while (true) {
            menu.displayMenu();
            System.out.print("Enter item number to order (0 to checkout): ");
            int choice = sc.nextInt();

            if (choice == 0) {
                break;
            }

            Menu.Item item = menu.getItemByIndex(choice - 1);
            if (item == null) {
                System.out.println("Invalid choice. Try again.");
                continue;
            }

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();
            if (qty <= 0) {
                System.out.println("Quantity must be positive.");
                continue;
            }

            bill.addItem(item, qty);
            System.out.println("Added " + qty + " x " + item.getName() + " to your order.");

            System.out.print("Order more? (y/n): ");
            String more = sc.next();
            if (more.equalsIgnoreCase("n")) {
                break;
            }
        }

        bill.generateBill();
        System.out.println("Thank you for visiting!");
        sc.close();
    }
}