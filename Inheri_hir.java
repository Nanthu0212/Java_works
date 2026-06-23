class mainone{
    void show(){
        System.out.println("The message from the main class ");
    }
}
class a extends mainone{
    void display(){
        System.out.println("The message from class A");
    }
}
class b extends mainone{
    void display(){
        System.out.println("The message from class B ");
    }
}
public class Inheri_hir {
    public static void main(String[] args) {
        a A = new a();
        b B = new b();
        A.show();
        A.display();
        B.show();
        B.display();
        System.out.println("The main class is called by both the child class (hierarchial inhertance ");
    }
}
