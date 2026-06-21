import java.util.Scanner;
public class Array_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] arr = new char[5];
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter first or next elementv :");
            arr[i] = sc.next().charAt(0);
        }
        for(char ch : arr) {
            System.out.print(ch + " ");
        }
    }
}
    
