import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Before swapping: num1 = " + num1 + ", num2 = " + num2);
        int sapv = num1;
        num1 = num2;
        num2 = sapv;
        System.out.println("\nAfter swapping: num1 = " + num1 + ", num2 = " + num2);

    }
}
