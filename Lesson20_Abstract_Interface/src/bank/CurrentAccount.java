package bank;
//CurrentAccount (текущий счет) - можно снять любую сумму, даже уйти в минус до -5000
public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    @Override
    public void withdraw(double amount) {
        final int MIN_AMOUNT = 0;
        if (amount <= 0) {
            System.out.printf("Withdraw from card :%s is NOT possible, amount (%.2f) is under %d.\n", accountNumber, amount, MIN_AMOUNT);
            return;
        }

        final int MIN_REMAIND = -5001;
        if (balance - amount <= MIN_REMAIND) {
            System.out.printf("Withdraw from card :%s is NOT possible, sum (%.2f) is under %d.\n", accountNumber, amount, MIN_REMAIND);
            return;
        }

        balance = balance - amount;
        System.out.printf("Withdraw :%.2f success, balance reminder :%.2f\n", amount, balance);
    }
}
