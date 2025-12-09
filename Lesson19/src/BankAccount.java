public class BankAccount {
    private int accountNum;
    private String owner;
    private double balance;
    BankAccount bankAccount;

    public String getInfo() {
        return "BankAccount [" +
                "account num :" + getAccountNum() +
                ", owner :" + getOwner() +
                ", balance :" + getBalance() +
                "]";
    }

    public BankAccount(int accountNum, String owner) {
        this.accountNum = accountNum;
        this.owner = owner;
    }

    public void deposit(BankAccount bankAccount, double money) {
        if (this.balance - money <= 0) {
            System.out.println("Don't have enough money");
            return;
        }
        bankAccount.deposit(money);
    }

    public void deposit(double money) {
        if (money <= 0) {
            System.out.println("Don't have enough money");
            return;
        }
        balance += money;
        System.out.println("Account :" + getAccountNum() + " deposit :" + money);

    }

    public void withdraw(double money) {
        if (balance - money <= 0) {
            System.out.println("Don't have enough money");
            return;
        }

        balance = balance - money;
    }

    public int getAccountNum() {
        return accountNum;
    }


    public String getOwner() {
        return owner;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void transfer(BankAccount bankAccount2, double money) {
        if (getBalance() - money <= 0) {
            System.out.println("Don't have enough money");
            return;
        }
        withdraw(money);
        bankAccount2.deposit(money);
    }
}
