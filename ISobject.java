class Animal{
    void eat(){
        System.out.println("Animals eat !");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dogs bark !");
    }
}
class Cat extends Animal{
    void meyaoo(){
        System.out.println("Cats meyaoo !");
    }
}
public class ISobject {
    public static void main(String[] args) {
        Dog d = new Dog();
        if(d instanceof Animal){
            System.out.println("The class Dog is related to the class Animal !");
        }
        else{
            System.out.println("The class Dog is NOT related to the class Animal !");
        }
    }
    
}
