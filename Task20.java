import java.util.Scanner;
public class Task20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number : ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number : ");
        int num3 = sc.nextInt();
        System.out.print("Enter the fourth number : ");
        int num4 = sc.nextInt();
        System.out.print("Enter the fifth number : ");
        int num5 = sc.nextInt();
        int avg = (num1 + num2 + num3 + num4 + num5) / 5;
        System.out.println("The average value is : " + avg);
    }
    
}
