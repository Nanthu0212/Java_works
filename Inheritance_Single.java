class Teacher{
    String name = "nanthu";
}
class MathTeacher extends Teacher{
    void show(){
        System.out.println(name + " is an maths teacher :");
    }
}
public class Inheritance_Single {
    public static void main(String[] args) {
        MathTeacher Mt = new MathTeacher();
        Mt.show();
        
    }
}
