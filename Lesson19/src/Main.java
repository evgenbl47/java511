import animal.Animal;
import animal.Bird;
import animal.Cat;
import animal.Dog;
import car.Bicycle;
import car.Car;
import car.Motorcycle;

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

//        Задание 2: Студент
//        Создай класс Student с приватными полями: имя, возраст, средний балл.
//        Добавь геттеры и сеттеры, но в сеттере для возраста проверяй,
//        чтобы возраст был от 16 до 100 лет, а для среднего балла - от 0 до 100.
        Student student = new Student();

        student.setAge(20);
        student.setAverage(40);

        System.out.println("student.getAge() :" + student.getAge());
        System.out.println("student.getAverage() :" + student.getAverage());

//        Задание 3: Книга
//        Создай класс Book с приватными полями: название, автор, количество страниц, цена.
//        Сделай поля название и автор доступными только для чтения (только геттеры),
//        а цену можно изменять, но только на положительное значение.

        Book book = new Book("autor", "title", 20);
        book.setPrice(12);

//        Задание 4: Прямоугольник
//        Создай класс Rectangle с приватными полями длина и ширина.
//        Добавь методы для установки размеров (с проверкой на положительные значения),
//        методы для вычисления площади и периметра. Не давай прямого доступа к полям.

        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("calc area :" + rectangle.calcArea());
        System.out.println("calc perimeter :" + rectangle.calcPerimeter());

//        Задание 5: Пароль
//        Создай класс Password с приватным полем для хранения пароля.
//        Добавь метод для установки пароля (минимум 8 символов), метод для проверки пароля
//        (сравнение с введенным) и запрети прямое получение пароля (нет геттера).

        Password password = new Password();
        password.setPassword("asd456AS");
        password.checkPassword("asd456AS");


//        Задание 7: Транспорт
//        Создай класс car.Vehicle с полями марка, год выпуска, скорость.
//        Создай дочерние классы Car (добавь количество дверей),
//        Motorcycle (добавь тип мотоцикла) и Bicycle (добавь количество передач).
//        У каждого свой метод движения.


        Bicycle bicycle = new Bicycle("model", 1990);
        Motorcycle motorcycle = new Motorcycle("model", 1980);
        System.out.println(motorcycle.getType());
        Car car = new Car("car", 200);
        System.out.println(car.getType());
    }

    }
}