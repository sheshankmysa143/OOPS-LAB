package Encapsulation;

class BankAccount {
    private String accountHolder;
    private double balance;

    public void setAccountHolder(String name) {
        this.accountHolder = name;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance)
            balance -= amount;
        else
            System.out.println("Insufficient funds or invalid amount.");
    }
}

public class BankTest {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Sheshank");
        acc.deposit(5000);
        acc.withdraw(1500);

        System.out.println("Account Holder: " + acc.getAccountHolder());
        System.out.println("Balance: ₹" + acc.getBalance());
    }
}
