class Student{
    String name;
    int age;
    void get_info(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);

}
}
public class Class_stu {
    public static void main(String[] args){
        Student stu =  new Student();
        stu.get_info("John", 20);
        stu.display();

        }
    }
    

