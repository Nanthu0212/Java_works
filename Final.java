class bank{
    String name = "AYC_BANK";
    final double intrest = 12.80;
}
class Acc extends bank{
    int acc_no = 1;
    String acc_type = "Savings";
    String name = "Nanthu";
    double bal = 12000;
    String Bank_name = super.name;
}
public class Final {
    public static void main(String[] args) {
        Acc account = new Acc();
        System.out.println("*****************!!!!!!!!! "+ account.Bank_name + " WELCOMES YOU !!!!!!*****************************");
        System.out.println("DEAR CUSTOMER : \t" + account.name +"\n YOUR ACCOUNT NUMBER IS :\t" + account.acc_no);
        System.out.println("YOUR ACCOUND TYPE : \t" + account.acc_type +"\n YOUR BALANCE IS : \t" + account.bal +"\n YOUR INTREST IS : \t"+ account.intrest );
    }
    
}
