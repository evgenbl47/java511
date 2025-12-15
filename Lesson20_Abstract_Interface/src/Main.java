import bank.BankAccount;
import bank.Savings;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 20");


        Savings savings = new Savings("1111", 0, "Tom");
        savings.info();
        savings.getBalance();
        System.out.println("deposit(-30)");
        savings.deposit(-30);
        System.out.println("deposit(10)");
        savings.deposit(10);
        savings.getBalance();

        System.out.println("restock(2000)");
        savings.restock(2000);
        System.out.println("deposit(3000)");
        savings.deposit(3000);
        System.out.println("restock(2000)");
        savings.restock(2000);
        System.out.println("withdraw(1000)");
        savings.withdraw(1000);
        savings.info();

    }
}