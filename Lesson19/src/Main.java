import animal.Animal;
import animal.Bird;
import animal.Cat;
import animal.Dog;

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

//    Задание 6: Иерархия животных
//    Создай базовый класс animal с полями имя и возраст, методом makeSound().
//    Создай три дочерних класса: Dog, Cat, Bird. Каждый должен переопределить метод makeSound()
//    своим звуком и добавить один уникальный метод (например, собака умеет приносить палку).

        Dog martin = new Dog("dog", 3);
        Cat max = new Cat("cat", -2);
        Bird cockatoo = new Bird("bird", 1);

        Animal[] animals = new Animal[]{martin, max, cockatoo};

        for (Animal animal : animals) {
            System.out.println(animal.getInfo());
            animal.makeSound();
            animal.doSmth();

        }
    }


}