import bank.BankAccount;
import bank.Savings;
import transport.Boat;
import transport.Car;
import transport.Transport;

import java.util.concurrent.TransferQueue;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Lesson 20");
//        Часть 1: Абстрактные классы (5 заданий)
//        Задание 1: Банковские счета
//        Создайте абстрактный класс BankAccount с полями:
//        accountNumber (String) - номер счета
//        balance (double) - баланс
//        ownerName (String) - имя владельца
//        Добавьте:
//        Конструктор для инициализации всех полей
//        Конкретный метод deposit(double amount) - пополнение счета
//        Конкретный метод getBalance() - получение баланса
//        Абстрактный метод withdraw(double amount) - снятие денег
//        Создайте два класса-наследника:
//        SavingsAccount (сберегательный счет) - можно снять деньги только если баланс после снятия останется >= 1000
//        CurrentAccount (текущий счет) - можно снять любую сумму, даже уйти в минус до -5000

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


//        Задание 2: Транспорт
//        Создайте абстрактный класс Transport с полями:
//        brand (String) - марка
//        year (int) - год выпуска
//        maxSpeed (int) - максимальная скорость
//        Добавьте:
//        Конструктор
//        Конкретный метод displayInfo() - выводит информацию о транспорте
//        Абстрактный метод move() - описывает как движется транспорт
//        Абстрактный метод refuel() - описывает как заправляется
//        Создайте классы-наследники:
//        Car - move() выводит "Едет по дороге", refuel() выводит "Заправка бензином"
//        Boat - move() выводит "Плывет по воде", refuel() выводит "Заправка дизелем"

        Transport car = new Car("Toyota", 1980, 220);
        Transport boat = new Boat("Titanik", 1911, 42);

        car.displayInfo();
        car.move();
        car.refuel();
        boat.displayInfo();
        boat.move();
        boat.refuel();
    }
}