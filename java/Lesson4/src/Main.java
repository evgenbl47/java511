import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//1. Запросите у пользователя его имя и выведите в ответ: «Привет, его имя!».
        System.out.println("Enter your name:");
        String name = scanner.nextLine();
        System.out.printf("Привет, %s\n\n", name);

//2. Запросите у пользователя год его рождения,
// посчитайте, сколько ему лет и выведите результат.
// Текущий год укажите в коде как константу (final).
        System.out.println("Enter your birth age:");
        int birthAge = scanner.nextInt();
        final int currentYear = 2025;
        System.out.printf("User age:%d\n\n", currentYear - birthAge);

//3. Запросите у пользователя длину стороны квадрата и выведите периметр такого квадрата.
        System.out.println("Enter a side of sqare:");
        int sqarePrerimeter = scanner.nextInt();
        System.out.printf("Sqare perimeter: %d\n\n", sqarePrerimeter * 4);

//4. Запросите у пользователя радиус окружности и выведите площадь такой окружности.
        System.out.println("Enter radius of circle:");
        double circleRadius = scanner.nextDouble();

        double circlePerimeter = 2 * 3.14 * circleRadius;
        System.out.printf("Perimeter of circle:%.2f\n\n", circlePerimeter);

//5. Запросите у пользователя расстояние в км между двумя городами
// и за сколько часов он хочет добраться. Посчитайте скорость,
// с которой необходимо двигаться, чтобы успеть вовремя.
        System.out.println("Enter distance between to city's:");
        int distanceBetweenCity = scanner.nextInt();
        System.out.println("Enter hours:");
        int amountHours = scanner.nextInt();

        System.out.printf("You need to move with speed %.2f\n\n", (double)distanceBetweenCity / amountHours);

//6. Реализуйте конвертор валют. Пользователь вводит доллары,
// программа переводит в евро. Курс валюты храните в константе.
        final double course = 0.8939d;
        System.out.println("Enter dollar:");
        double dollars = scanner.nextDouble();

        System.out.printf("You can exchange %.2f dollars to %.2f euro\n\n", dollars, dollars * course);

//7. Пользователь указывает объем флешки в Гб.
// Программа должна посчитать сколько файлов размером в 820 Мб помещается на флешку.
        System.out.println("Enter memory on flash:");
        int flashMemory = scanner.nextInt();
        final int fileSize = 820;

        System.out.printf("You can put %d files on flash memory\n\n", (flashMemory * 1024) / fileSize);

//8. Пользователь вводит сумму денег в кошельке и цену одной шоколадки.
// Программа выводит сколько шоколадок может купить пользователь и сколько сдачи у него останется.
        System.out.println("Enter money amount");
        double amountMoney = scanner.nextDouble();
        System.out.println("Enter chocolate price");
        double chocolatePrice = scanner.nextDouble();

        System.out.printf("You can bue: %d chocolate an get cashback: %.2fn\n\n", (int) (amountMoney / chocolatePrice), amountMoney % chocolatePrice);

//9**. Запросите у пользователя трехзначное число и выведите его задом наперед.
// Для решения задачи вам понадобится оператор % (остаток от деления).

        System.out.println("Enter 3 symbol number");
        int thirdOld = scanner.nextInt();
        int sto = thirdOld / 100;
        int desat = (thirdOld - (sto * 100)) / 10;
        int odin = thirdOld - (sto * 100) - (desat * 10);
        System.out.printf("%d%d%d you entered number\n",sto, desat, odin);
        System.out.printf("%d%d%d your new number\n", odin, desat, sto);

//10. Запросите у пользователя целое число и выведите в ответ,
// четное число или нет. В задании используйте логические операторы.
        System.out.println("Enter any number");
        int userNumber = scanner.nextInt();

        System.out.printf("Number is odd:%b, number is even:%b\n", userNumber % 2 != 0, userNumber %2 == 0);

//11. Запросите у пользователя целое число и выведите в ответ,
//положительное число или нет. В задании используйте логические операторы.
        System.out.println("Enter positive or negative number");
        int userNum = scanner.nextInt();
        if (userNum > 0) {
            System.out.println("Number is positive\n");
        } else if (userNum < 0) {
            System.out.println("Number is negative\n");
        } else {
            System.out.println("Number is 0\n");
        }

//12. Запросите у пользователя целое число и выведите в ответ,
// Делиться ли число на  7 и 5 без остаток или нет.
// В задании используйте логические операторы.

        System.out.println("Enter even number");
        int userInput = scanner.nextInt();

        System.out.printf("reminder %b after divide by 7\n",(userInput % 7) != 0);
        System.out.printf("reminder %b after divide by 5\n", (userInput % 5) != 0);

//13. У Никиты на 5 яблок больше чем у Саши
//У Саши в 2 раза больше чем у Насти
//У Насти количество яблок состовляет Сумма количеств яблок у Фарида и Олега
//У Олега количество яблок на 2 меньше чем у Фарида
//и у Фарида 10 яблок
//Распичатать количество яблок у каждого человека
        int farid = 10;
        int oleg = farid - 2; //8
        int nasta = oleg + farid; //18
        int sasha = nasta * 2; //36
        int nikita = sasha + 5; //41
        System.out.printf("Nikita:%d, Sasha:%d, Nasta:%d, Oleg:%d, Farid:%d\n\n", nikita, sasha, nasta, oleg, farid);

    }
}
