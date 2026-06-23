class person{
    String p1 ="nanthu";
    String p2 ="Kishore";

}
class employee extends person{
    int Emp_p1 = 001;
    int Emp_p2 = 002;
}
class Manager extends employee{
    void show_manager(){
        System.out.println("The Manager name is : " + p1 + " and the employee id is :" + Emp_p1 );
    }
}
public class Inheritance_multlevel {
    public static void main(String[] args) {
        Manager M = new Manager();
        M.show_manager();
        
        
    }
}
