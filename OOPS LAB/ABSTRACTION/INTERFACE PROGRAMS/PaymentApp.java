package Abstraction;

interface OnlinePayment {
    void pay(double amount);
}

class Paytm implements OnlinePayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Paytm.");
    }
}

class GooglePay implements OnlinePayment {
    public void pay(double amount) {
        System.out.println("Paid ₹" + amount + " using Google Pay.");
    }
}

public class PaymentApp {
    public static void main(String[] args) {
        OnlinePayment p1 = new Paytm();
        OnlinePayment p2 = new GooglePay();

        p1.pay(999);
        p2.pay(499);
    }
}
