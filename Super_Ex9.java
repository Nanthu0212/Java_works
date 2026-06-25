class Animal {
    void sound() {
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal {
    void sound() {
        super.sound();
        System.out.println("Dog Barks");
    }
}

public class Super_Ex9 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.sound();
    }
}