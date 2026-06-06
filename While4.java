import java.util.Scanner;
public class While4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int i = 1;
        int fac=1;
        while(i<=n){
            fac = fac * i;
            i++;
            }
        System.out.println("The Factorial of the :" + n + " is: " + fac);
        }
}

