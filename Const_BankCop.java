class BankAccount {
    int accno;
    double balance;
    String name;
    String Type;
    BankAccount (int nu, String n, String t, double b) {
        accno = nu;
        name = n;
        balance = b;
        Type = t;
        System.out.println("Accound created successfully");
    }
    BankAccount(BankAccount x){
        this.accno = x.accno ;
        this.name = x.name ;
        this.balance = x.balance;
        this.Type = x.Type;
    }

}
public class Const_BankCop {
    public static void main(String[] args){
        BankAccount b1 = new BankAccount (001,"Nantha Kishore","Savings",2000);
        BankAccount b2 = new BankAccount (b1);

        System.out.println("Accound number :"+ b1.accno);
        System.out.println("Name : "+b1.name);
        System.out.println("Balance : "+b1.balance);
        System.out.println("Accound Type : "+b1.Type);
        System.out.println("Copyed Accound number :"+ b2.accno);
        System.out.println("Copyed Name : "+b2.name);
        System.out.println("Copyed Balance : "+b2.balance);
        System.out.println("Copyed Accound Type : "+b2.Type);

    }
    
}

