package bank;
//SavingsAccount (сберегательный счет) - можно снять деньги только если баланс после снятия останется >= 1000
public class Savings extends BankAccount{
    private double savings = 500; //Start bonus
    public Savings(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    public void restock(double amount) {
        final int MIN_AMOUNT = 0;
        if (!checkPositive(amount)) {
            System.out.printf("Restock card :%s is NOT possible, sum (%.2f) is under %d.\n", accountNumber, amount, MIN_AMOUNT);
            return;
        }
        if (!checkPositive(getBalance() - amount)) {
            System.out.println(getBalance() - amount);
            System.out.printf("Restock card :%s is NOT possible, new balance (%.2f) after operation is under %d.\n", accountNumber, getBalance() - amount, MIN_AMOUNT);
            return;
        }

        System.out.printf("Restock card :%s, new balance (%.2f), new savings :%.2f.\n", accountNumber, getBalance(), savings );
        balance = balance - amount;
        savings = savings + amount;


    }

    public void withdrawSavings(double amount) {
        final int MIN_AMOUNT = 0;
        if (!checkPositive(amount)) {
            System.out.printf("Withdraw savings from card :%s is NOT possible, sum (%.2f) is under %d.\n", accountNumber, amount, MIN_AMOUNT);
            return;
            }

        final int MIN_REMINDER = 1000;
        if (savings + amount <= MIN_REMINDER) {
            System.out.printf("After withdraw savings operation balance can't be under :%d\n", MIN_REMINDER);
            return;
        }
        System.out.println("to do Savings withdraw Success");

        savings = savings - amount;
        balance = balance + amount;

    }

    @Override
    public void withdraw(double amount) {
        final int MIN_AMOUNT = 0;
        if (amount < MIN_AMOUNT) {
            System.out.printf("Withdraw from card :%s is NOT possible, sum (%.2f) is under %d.\n", accountNumber, amount, MIN_AMOUNT);
            return;
        }

        final int MIN_REMINDER = 1000;
        if (getBalance() + amount <= MIN_REMINDER) {
            System.out.printf("After withdraw operation balance can't be under :%d\n", MIN_REMINDER);
            return;
            }

        System.out.println("to do Withdraw Success");
        balance = balance - amount;
    }

    public boolean checkPositive(double amount) {
        final int MIN_AMOUNT = 0;
        if (amount < MIN_AMOUNT) {
            return false;
        }
        return true;
    }

    @Override
    public void info() {
        System.out.printf("Account number :%s, owner :%s, balance :%.2f, savings %.2f.\n", accountNumber, getOwnerName(), balance, savings);
    }
}
