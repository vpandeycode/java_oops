interface Payment {
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using Credit Card");
    }
}

class UPIPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using UPI");
    }
}

class PayPalPayment implements Payment {
    public void pay(double amount) {
        System.out.println("Paid Rs. " + amount + " using PayPal");
    }
}

public class Question3 {
    public static void main(String[] args) {
        Payment payment;

        payment = new CreditCardPayment();
        payment.pay(5000);

        payment = new UPIPayment();
        payment.pay(2500);

        payment = new PayPalPayment();
        payment.pay(3000);
    }
}