class BankAccount {
    String accountHolder;
    int accountNumber;
    double balance;

    BankAccount(String name, int accNo, double initialBalance) {
        accountHolder = name;
        accountNumber = accNo;
        balance = initialBalance;
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: ₹" + amount);
    }

    void deposit(double amount, String source) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " from " + source);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void withdraw(double amount, String mode) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn ₹" + amount + " via " + mode);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void showBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: ₹" + balance);
        System.out.println();
    }

    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Sheshank", 123456, 5000.0);

        acc1.showBalance();

        acc1.deposit(2000);
        acc1.deposit(1500, "Online Transfer");

        acc1.withdraw(1000);        
        acc1.withdraw(3000, "ATM");
        acc1.showBalance();
    }
}
