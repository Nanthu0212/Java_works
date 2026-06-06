import java.util.Scanner;
public class Amstrong{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number to check for Amstrong number :");
		int num =sc.nextInt();
		int in_num=num;
		if (num>99 && num<=999){
			int num3=num%10;
			num /=10;
			int num2=num%10;
			num /=10;
			int num1=num%10;
			if((num1*num1*num1)+(num2*num2*num2)+(num3*num3*num3)==in_num){
				System.out.println("The number :" + in_num + "! is an Amstrong number !");
			}
			else{
				System.out.println("The number :" + in_num + "! is Not an Amstrong number !");
			}
		}
		if (num>9 && num<=99){
			int num2 =num%10;
			num /=10;
			int num1 =num%10;
			if((num1*num1*num1)+(num2*num2*num2)==in_num){
				System.out.println("The number :" + in_num + "! is an Amstrong number !");
			}
			else{
				System.out.println("The number :" + in_num + "! is Not an Amstrong number !");
			}
		}
	}
}

