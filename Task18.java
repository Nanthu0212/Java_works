import java.util.Scanner;
public class Task18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int x = sc.nextInt();
        if (x > 0) {
            System.out.println(x + " is a positive number.");
        } else if (x < 0) {
            System.out.println(x + " is a negative number.");
        } else {
            System.out.println("The number is zero.");
        }
    }
}

