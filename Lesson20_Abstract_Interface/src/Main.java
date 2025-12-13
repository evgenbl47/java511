import bank.BankAccount;
import bank.Savings;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 20");

        BankAccount bankAccount = new BankAccount("1111", 0, "Tom") {
            @Override
            public void withdraw(double amount) {
                System.out.println("todo: widhdraw");
            }
        };

        Savings savings = new Savings("1111", 0, "Tom");
        bankAccount.setSavings(savings);
        bankAccount.info();
        bankAccount.getBalance();
        System.out.println("deposit(-30)");
        bankAccount.deposit(-30);
        System.out.println("deposit(10)");
        bankAccount.deposit(10);
        bankAccount.getBalance();

        System.out.println("restock(2000)");
        savings.restock(2000);
        System.out.println("deposit(3000)");
        bankAccount.deposit(3000);
        System.out.println("restock(2000)");
        savings.restock(2000);
        System.out.println("withdraw(1000)");
        savings.withdraw(1000);
        bankAccount.info();
        savings.info();

    }
}