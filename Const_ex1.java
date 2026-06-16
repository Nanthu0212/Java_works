class Student {
    int rollno;
    int mark;
    String name;
    Student(int r,String n,int m) {
        rollno = r;
        name = n;
        mark = m;
        System.out.println("Entery created sucessfully");
    }
}
public class Const_ex1 {
    public static void main(String[] args){
        Student s1 = new Student(01,"nanthu",85);
        System.out.println("Roll no: "+s1.rollno);
        System.out.println("Name: "+s1.name);
        System.out.println("Mark: "+s1.mark);


    }
    
}
