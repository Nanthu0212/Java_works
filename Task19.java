import java.util.Scanner;
public class Task19{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Name : ");
        String name = sc.nextLine();
        System.out.print("Enter the mark : ");
        int Mark = sc.nextInt();
        System.out.println("Hello, " + name + "! Your mark is " + Mark + ".");
    }
}