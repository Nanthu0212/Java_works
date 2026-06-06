import java.util.Scanner;
public class While3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int mul = 1;
        int i = 1;
        while(i<=10){
            mul = n * i;
            System.out.println(n + " x " + i + " = " + mul);
            i++;

        }

    }
}
