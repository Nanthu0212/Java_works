import java.util.Scanner;
class Employee{
    String name;
    int id;
    double salary;
    void get_data(String n, int i, double s){
        name = n;
        id = i;
        salary = s;
    }
    void display(){
        System.out.println("Employee Information:");
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);
    }
}
public class Class_Emp {
    public static void main(String[] args){
        Employee Emp = new Employee();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String name = sc.nextLine();
        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();
        System.out.print("Enter employee salary: ");
        double salary = sc.nextDouble();
        Emp.get_data(name, id, salary);
        Emp.display();
    }
}
