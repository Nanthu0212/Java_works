import java.util.Scanner;
public class Task16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Temperature in Celsius: ");
        int c = sc.nextInt();
        int f = (c * 9/5) + 32;
        System.out.print("The Temperature in Fahrenheit is : " + f);
    }
    
}

