class BankAcc {
    int accno;
    double balance;
    String name;
    String Type;
    BankAcc (int nu, String n, String t, double b) {
        accno = nu;
        name = n;
        balance = b;
        Type = t;
        System.out.println("Accound created successfully");
    }
}
public class Const_Bank {
    public static void main(String[] args){
        BankAcc b1 = new BankAcc (001,"Nantha Kishore","Savings",2000);
        System.out.println("Accound number :"+ b1.accno);
        System.out.println("Name : "+b1.name);
        System.out.println("Balance : "+b1.balance);
        System.out.println("Accound Type : "+b1.Type);

    }
    
}

