//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Задания на инкапсуляцию (5 заданий)
//        Задание 1: Банковский счет
//        Создай класс BankAccount с приватными полями: номер счета, владелец, баланс.
//        Добавь методы для пополнения счета, снятия денег (с проверкой достаточности средств) и
//        получения баланса.
//        Все поля должны быть защищены от прямого доступа.

        BankAccount accountOne = new BankAccount(1111, "AA");
        BankAccount accountTwo = new BankAccount(2222, "BB");

        accountOne.deposit(500);
        accountOne.deposit(accountTwo, 250);
        accountTwo.withdraw(100);
        accountOne.transfer(accountTwo, 400);

        System.out.println(accountOne.getInfo());
        System.out.println(accountTwo.getInfo());
    }

}