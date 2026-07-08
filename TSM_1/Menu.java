public class Menu {
    private Item[] items;

    public Menu() {
        items = new Item[6];
        items[0] = new Tea("Masala Tea", 20);
        items[1] = new Tea("Ginger Tea", 15);
        items[2] = new Coffee("Black Coffee", 25);
        items[3] = new Coffee("Milk Coffee", 30);
        items[4] = new Snack("Biscuits", 10);
        items[5] = new Snack("Samosa", 35);
    }

    public void displayMenu() {
        System.out.println("===== Tea Stall Menu =====");
        for (int i = 0; i < items.length; i++) {
        System.out.println((i + 1) + ". " + items[i].getName() + " - Rs." + items[i].getPrice());
        }
        System.out.println("==========================");
    }

    public Item getItemByIndex(int index) {
        if (index >= 0 && index < items.length) {
            return items[index];
        }
        return null;
    }

    public static abstract class Item {
        private String name;
        private double price;

        public Item(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() { return name; }
        public double getPrice() { return price; }

        public abstract String getDescription();
    }

    public static class Tea extends Item {
        public Tea(String name, double price) {
            super(name, price);
        }
        public String getDescription() {
            return "Hot tea";
        }
    }

    public static class Coffee extends Item {
        public Coffee(String name, double price) {
            super(name, price);
        }
        public String getDescription() {
            return "Fresh coffee";
        }
    }

    public static class Snack extends Item {
        public Snack(String name, double price) {
            super(name, price);
        }
        public String getDescription() {
            return "Tasty snack";
        }
    }
}