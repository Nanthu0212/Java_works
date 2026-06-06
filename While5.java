import java.util.Scanner;
public class While5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        while(n<10 && n>0){
            System.out.println(n);
        }
        while(n>=10 && n<=99){
            int num2 = n%10;
            int num1 = n/10;
            System.out.println("The First digit is: " + num1);
            System.out.println("The Second digit is: " + num2);
            break;
        }
        while(n>=100 && n<=999){
            int num3 = n%10;
            int num2 = (n/10)%10;
            int num1 = n/100;
            System.out.println("The First digit is: " + num1);
            System.out.println("The Second digit is: " + num2);
            System.out.println("The Third digit is: " + num3);
            break;
        }
}
}