import java.util.Scanner;
public class While2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i = 1;
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("The Total Sum is: " + sum);
    }
}
