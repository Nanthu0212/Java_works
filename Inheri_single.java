class parant{
    void show(){
        System.out.println("Message from parante");
    }
}
class child extends parant{
    void print(){
        System.out.println("Message from student ");
    }

}
public class Inheri_single {
    public static void main(String[] args){
        child c = new child();
        c.show();
        c.print();
        System.out.println("Message printed successsfully");

    }
    
}
