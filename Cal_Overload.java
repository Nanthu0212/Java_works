import java.util.Scanner;
class Calculater {
    int add(int a, int b){
        return a+b;
    }
    float add(float a, float b){
        return a+b;
    }
    double add(double a, double b){
        return a+b;
    }
}
public class Cal_Overload {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculater c = new Calculater();
        System.out.println("Enter your choice of addition : \n 1. Interger \n 2. float \n 3. double ");
        int choice = sc.nextInt();
        switch(choice){
            case 1:{
                System.out.println("Enter the two intergers one after one : \n");
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println("Addition of intergers : " + c.add(a,b));
                break;
            }
            case 2:{
                System.out.println("Enter the two floats one after another : \n");
                float a = sc.nextFloat();
                float b = sc.nextFloat();
                System.out.println("Addition of floats :" + c.add(a,b));
                break;
            }
            case 3:{
                System.out.println("Enter the two doubles one after another : \n");
                double a = sc.nextDouble();
                double b = sc.nextDouble();
                System.out.println("Addition of doubles :" + c.add(a,b));
                break;
            }
            default:{
                System.out.println("Enter an valid option please !!! ");
                break;
                }
            }
            System.out.println("Program endded sussesfully ");
            sc.close();


        }
    
}

