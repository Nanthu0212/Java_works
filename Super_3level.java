class Bank {
    String bankName = "ABC Bank";

    Bank() {
        System.out.println("Bank Constructor Called");
    }

    void display() {
        System.out.println("Welcome to " + bankName);
    }
}

class Account extends Bank {
    String bankName = "XYZ Bank";

    Account() {
        super();   // 1. Calls parent constructor
        System.out.println("Account Constructor Called");
    }

    void showDetails() {
        System.out.println("Child Bank Name : " + bankName);
        System.out.println("Parent Bank Name: " + super.bankName);   // 2. Access parent variable

        super.display();   // 3. Call parent method
    }
}

public class Super_3level {
    public static void main(String[] args) {
        Account acc = new Account();
        acc.showDetails();
    }
}