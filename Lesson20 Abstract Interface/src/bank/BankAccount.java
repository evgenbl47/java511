package bank;

public abstract class BankAccount {

    protected String accountNumber;
    protected double balance;
    protected String ownerName;


    public BankAccount(String accountNumber, double balance, String ownerName) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;
    }

    public void deposit(double amount) {
        final int INCORRECT = 0;
        if (amount <= INCORRECT) {
            System.out.printf("Deposit to card :%s is NOT update, payment (%.2f) is under %d.\n", accountNumber, amount, INCORRECT);
            return;
        }
        balance = balance + amount;
        System.out.printf("Deposit to card :%s is update, payment :%.2f sucess, balance :%.2f.\n", accountNumber, amount, balance);
    }

    public double getBalance() {
        return balance;
    }

    public abstract void withdraw(double amount);

    public void info() {
        System.out.printf("Account number :%s, owner :%s, balance :%.2f.\n", accountNumber, ownerName, balance);
    }

    public String getOwnerName() {
        return ownerName;
    }


}
