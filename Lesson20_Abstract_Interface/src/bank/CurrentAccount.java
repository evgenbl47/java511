package bank;
//CurrentAccount (текущий счет) - можно снять любую сумму, даже уйти в минус до -5000
public class CurrentAccount extends BankAccount{
    public CurrentAccount(String accountNumber, double balance, String ownerName) {
        super(accountNumber, balance, ownerName);
    }

    @Override
    public void withdraw(double amount) {

    }
}
