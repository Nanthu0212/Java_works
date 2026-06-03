import java.util.Scanner;
public class Task6{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the Age : ");
        int age = sc.nextInt();
        System.out.print("Enter your favorite subject : ");
        String subject = sc.next();
        System.out.println("Hello, " + name + "! You are " + age + " years old and your favorite subject is " + subject + ".");
    }
}