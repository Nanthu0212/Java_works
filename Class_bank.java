import java.util.Scanner;
class AccountBal{
    double balance;
    void get_data(double b){
        balance = b;
    }
    void withdraw(double amount){
        if(amount > balance){
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
            System.out.println("Withdrawal successful. Remaining balance: " + balance);
        }
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposit successful. Current balance: " + balance);
    }

    
}

public class Class_bank {
    public static void main(String[] args){
        AccountBal acc = new AccountBal();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter initial balance: ");
        double inBal = sc.nextDouble();
        acc.get_data(inBal);
        
        System.out.print("Enter amount to withdraw: ");
        double withamount = sc.nextDouble();
        acc.withdraw(withamount);
        
        System.out.print("Enter amount to deposit: ");
        double depamount = sc.nextDouble();
        acc.deposit(depamount);
    }
    
}
