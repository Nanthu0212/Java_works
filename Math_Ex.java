import static java.lang.Math.*;
import java.util.Scanner;

public class Math_Ex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to find square in Math :");
        int sq = sc.nextInt();
        System.out.println("Square Root = " + sqrt(sq));
        System.out.print("Enter the number to find power in Math :");
        int pn = sc.nextInt();
        System.out.print("Enter the number of power factor :");
        int pf = sc.nextInt();
        System.out.println("Power = " + pow(pn, pf));
    }
}