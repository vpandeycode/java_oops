class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Amount deposited.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance = balance - amount;
            System.out.println("Amount withdrawn.");
        }
    }

    double getBalance() {
        return balance;
    }
}

public class Question2 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(101, "Sambhav", 5000);

        account.deposit(2000);
        account.withdraw(1000);

        System.out.println("Balance: " + account.getBalance());
    }
}