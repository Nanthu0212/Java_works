public class Variables {
    static String college = "MSU";
    String name = "Nanthu";
    void show() {
        System.out.println("Name: " + name);
        System.out.println("College: " + college);
    }
    public static void main(String[] args) {
        Variables obj = new Variables();
        obj.show();
    }
}