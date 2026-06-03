import java.util.Scanner;
public class Task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an Character : ");
        char ch = sc.next().charAt(0);
        int asciiValue = ch;
        System.out.print("The ASCII value of " + ch + " is : " + asciiValue);

    }
    
}

