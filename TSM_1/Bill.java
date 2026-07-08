public class Bill {
    private Menu.Item[] orderedItems;
    private int[] quantities;
    private int orderCount;

    public Bill() {
        orderedItems = new Menu.Item[10];
        quantities = new int[10];
        orderCount = 0;
    }

    public void addItem(Menu.Item item, int qty) {
        for (int i = 0; i < orderCount; i++) {
            if (orderedItems[i].getName().equals(item.getName())) {
                quantities[i] += qty;
                return;
            }
        }
        if (orderCount < orderedItems.length) {
            orderedItems[orderCount] = item;
            quantities[orderCount] = qty;
            orderCount++;
        } else {
            System.out.println("Order limit reached!");
        }
    }

    public double calculateTotal() {
        double total = 0.0;
        for (int i = 0; i < orderCount; i++) {
            total += orderedItems[i].getPrice() * quantities[i];
        }
        return total;
    }

    public void generateBill() {
        System.out.println("\n===== BILL =====");
        if (orderCount == 0) {
            System.out.println("No items ordered.");
            return;
        }
        for (int i = 0; i < orderCount; i++) {
            Menu.Item item = orderedItems[i];
            int qty = quantities[i];
            System.out.println(item.getName() + " x " + qty + " = Rs." + (item.getPrice() * qty));
        }
        double total = calculateTotal();
        System.out.printf("Total: Rs.%.2f\n", total);
        System.out.println("================\n");
    }
}