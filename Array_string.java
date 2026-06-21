import java.util.Scanner;
public class Array_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[3];
        for(int i = 0; i < arr.length; i++) {
            System.out.print("Enter the string :");
            arr[i] = sc.next();
        }
        for(String s : arr) {
            System.out.println(s);
        }
    }
}
