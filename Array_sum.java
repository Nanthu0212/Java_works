import java.util.Scanner;
public class Array_sum {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[5];
        double sum = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.println("Enter the " + i + " number :");
            arr[i] = sc.nextDouble();
        }
        for(double n : arr) {
            sum += n;
        }
        System.out.println("The total Sum is = " + sum);
    }
}
