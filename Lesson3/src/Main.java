import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//Задача 1: Скидка на товар
//Напишите программу, которая запрашивает у пользователя цену товара и процент скидки,
//затем выводит финальную цену с использованием printf .
        System.out.println("Enter item price:");
        double price = scanner.nextDouble();

        System.out.println("Enter your discount:");
        double discount = scanner.nextDouble();

        double finalPrice = price -((discount / 100d) * price);

        System.out.printf("Final price: %.2f$\n\n", finalPrice);

//Задача 2:
//Пользователь вводит 3 оценки. Вычислите средний балл используя явное преобразование типов.
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        System.out.println("Enter third number:");
        int num3 = scanner.nextInt();

        double averege = ((double)num1 + (double)num2 + (double)num3 ) / 3d;

        System.out.println("Average number is: " + averege);

//Задача 3
//Напишите программу, которая запрашивает число у пользователя и проверяет:
//Делится ли оно на 2?
//Делится ли оно на 3?
//Делится ли оно на 5?
//Используйте printf для вывода результатов.
        System.out.println("\nEnter number that you want to check:");
        int checkNum = scanner.nextInt();

        System.out.printf("Check divide by 2:%b, by 3:%b, by 5:%b.\n\n", checkNum%2 ==0, checkNum %3 == 0, checkNum %5 ==0);

//Задача 4
//Создайте программу, которая проверяет число которое ввел пользователь,
//является ли число четным или нечетным.
        System.out.println("Enter any number to check:");
        int check = scanner.nextInt();

        System.out.printf("Your number:%d, number is even:%b, number is odd:%b.\n\n",check, check %2 == 0, check %2 != 0);

//Задача 5:
//Создайте переменные:
//String name = "Иван"
//int age = 25
//double height = 1.78
//char group = 'A'
//boolean isStudent = true
//Выведите их используя printf
        String name = "Иван";
        int age = 25;
        double height = 1.78;
        char group = 'A';
        boolean isStudent = true;

        System.out.printf("Name:%s, age:%d, height:%.2f, group:%c, isStudent:%b.\n\n", name, age, height, group, isStudent);

//Задача 6:
//Напишите программу, которая:
//Запрашивает два числа у пользователя
//Выводит результат деления
//Выводит остаток от деления
//
//  Пример
//  Введите 1-ое число : 25
//  Введите 2-ое число : 4
//  Результат деления : 6
//  Остаток : 1
        System.out.println("Enter number to divide:");
        int number = scanner.nextInt();

        System.out.println("Enter divide:");
        int divide = scanner.nextInt();

        int result = number / divide;
        int reminder = number % divide;

        System.out.println("Result:" + result);
        System.out.println("Reminder:" + reminder);

    }
}