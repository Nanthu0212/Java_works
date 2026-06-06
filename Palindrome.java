import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int num = n, r = 0;
        while (n > 0) {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        if (num == r)
            System.out.println(num + " is a Palindrome");
        else
            System.out.println(num + " is not a Palindrome");
    }
}

