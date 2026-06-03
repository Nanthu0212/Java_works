import java.util.Scanner;
public class Task14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Amount : ");
        int amount = sc.nextInt();
        System.out.print("Enter the interest rate : ");
        int rate = sc.nextInt();
        int interest = (amount * rate) / 100;
        System.out.println("The interest is : " + interest);
    }
    
}

