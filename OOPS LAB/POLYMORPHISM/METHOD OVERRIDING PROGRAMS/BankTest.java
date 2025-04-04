class BankAccount {
    String accountHolder;
    double balance;

    BankAccount(String name, double balance) {
        this.accountHolder = name;
        this.balance = balance;
    }

    void calculateInterest() {
        System.out.println("Generic account: No specific interest calculation.");
    }
}

class SavingsAccount extends BankAccount {

    SavingsAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.04;
        System.out.println("Savings Account Interest for " + accountHolder + ": ₹" + interest);
    }
}

class FixedDepositAccount extends BankAccount {

    FixedDepositAccount(String name, double balance) {
        super(name, balance);
    }

    @Override
    void calculateInterest() {
        double interest = balance * 0.07;
        System.out.println("Fixed Deposit Interest for " + accountHolder + ": ₹" + interest);
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc1 = new SavingsAccount("Sheshank", 10000);
        BankAccount acc2 = new FixedDepositAccount("Sheshank", 20000);

        acc1.calculateInterest();
        acc2.calculateInterest();
    }
}
