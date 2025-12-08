class ChildBankAccount {

    private double balance;
    private double maxBalance;

    public ChildBankAccount(int maxBalance) {
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney(double value) {
        if (value <= 0) {
            return false;
        }
        if (value + balance > maxBalance) {
            return false;
        }
        balance = balance + value;
        return true;
    }

    public boolean debitMoney(double value) {
        //todo
        if (value <= 0) {
            return false;
        }

        if (balance - value < 0) {
            //not enough
            return false;
        }

        balance = balance - value;
        return true;
    }

    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {

        ChildBankAccount account =
                new ChildBankAccount(10000);
        account.depositMoney(1000);
        account.depositMoney(2000);
        account.depositMoney(10000);
        account.depositMoney(-1000);
        System.out.println("Balance: " + account.getBalance());

        account.debitMoney(500);
        account.debitMoney(422.75);
        account.debitMoney(50000);
        account.debitMoney(-50);
        System.out.println("Balance: " + account.getBalance());


    }
}