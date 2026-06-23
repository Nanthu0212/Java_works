class a {
    void showa(){
        System.out.println("Class A is excuted !");
    }
}
class b extends a {
    void showb(){
        System.out.println("Class B is excuted !");
    }
}
class c extends b {
    void showc(){
        System.out.println("Class C is excuted !");
    }
}
public class Inheri_multi {
    public static void main(String[] args){
        c C = new c();
        C.showa();
        C.showb();
        C.showc();
        System.out.println("The three class A , B , C is been use with just class 'C' (multi level inheritance )");

    }
}
