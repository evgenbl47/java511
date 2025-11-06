import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//EASY

        Scanner scanner = new Scanner(System.in);

//Задание 1 - День недели
//Запросите у пользователя число от 1 до 7 и выведите день недели
//(1 - Понедельник, 2 - Вторник, и т.д.).
//Если число не от 1 до 7, выведите "Неправильный день".
        System.out.println("Введите день недели:");
        int weekDay = scanner.nextInt();

        if (weekDay < 1 || weekDay > 7) {
            System.out.println("Неправильный день");
        } else {
            switch (weekDay) {
                case 1 -> {
                    System.out.println("Понедельник");
                    break;
                }case 2 -> {
                    System.out.println("Вторник");
                    break;
                }case 3 -> {
                    System.out.println("Среда");
                    break;
                }case 4 -> {
                    System.out.println("Четверг");
                    break;
                }case 5 -> {
                    System.out.println("Пятница");
                    break;
                }case 6 -> {
                    System.out.println("Суббота");
                    break;
                }case 7 -> {
                    System.out.println("Воскресенье");
                    break;
                }
            }
        }

//Задание 2 - Оценка
//Запросите у пользователя оценку (5, 4, 3, 2, 1). Выведите:
//5 → "Отлично"
//4 → "Хорошо"
//3 → "Удовлетворительно"
//2 или 1 → "Плохо"

        System.out.println("Введите оценку:");
        int graduate = scanner.nextInt();

        switch (graduate) {
            case 5 -> {
                System.out.println("Отлично");
                break;
            }case 4 -> {
                System.out.println("Хорошо");
                break;
            }case 3 -> {
                System.out.println("Удовлетворительно");
                break;
            }case 2, 1 -> {
                System.out.println("Плохо");
                break;
            }
            default -> {
                System.out.println("Только от 1 и до 5 включительно");
            }
        }

//Задание 3 - Светофор
//Запросите у пользователя цвет светофора (red, yellow, green). Выведите:
//
//red → "Стоп"
//yellow → "Приготовься"
//green → "Иди"
        System.out.println("Введите цвет светофора (red, yellow, green)");
        String trafficLight = new Scanner(System.in).nextLine();

        switch (trafficLight) {
            case "red" -> {
                System.out.println("Стоп");
            }case "yellow" -> {
                System.out.println("Приготовься");
            }case "green" -> {
                System.out.println("Иди");
            }default -> {
                System.out.println("red, yellow, green ONLY!!!");
            }
        }

// Задание 4 - Количество дней в месяце
// Запросите у пользователя номер месяца (1-12) и выведите количество дней:

// 1, 3, 5, 7, 8, 10, 12 → "31 день"
// 4, 6, 9, 11 → "30 дней"
// 2 → "28 или 29 дней"
        System.out.println("Введите номер месяца:");
        int monthh = scanner.nextInt();

        switch (monthh) {
            case 1, 3, 5, 7, 8, 10, 12:
                System.out.println("31 день");
                break;
            case 4, 6, 9, 11:
                System.out.println("30 дней");
                break;
            case 2:
                System.out.println("28 или 29 дней");
                break;
            default:
                System.out.println("Только номер месяца");
        }

//Задание 5 - Калькулятор (простой)
//Запросите у пользователя два числа и операцию (+, -, *, /).
//Выведите результат операции.
        System.out.println("Введите первое число");
        int firstNumber = scanner.nextInt();
        System.out.println("Введите второе число");
        int secondNumber = scanner.nextInt();
        System.out.println("Введите знак операции (+, -, *, /)");
        String symbol = new Scanner(System.in).nextLine();

        switch (symbol) {
            case "+" -> {
                System.out.println(firstNumber + secondNumber);
                break;
            }case "-" -> {
                System.out.println(firstNumber - secondNumber);
                break;
            }case "*" -> {
                System.out.println(firstNumber * secondNumber);
                break;
            }case "/" -> {
                if (secondNumber == 0){
                    System.out.println("Err divide by 0");
                    break;
                }
                System.out.println(firstNumber / secondNumber);
                break;
            }
            default -> {
                System.out.println("Неизвестная операция");
            }
        }

//MEDIUM




//Задание 6 - Рабочий день или выходной
//Запросите у пользователя день недели (1-7). Выведите "Рабочий день" для 1-5 и "Выходной" для 6-7.

        System.out.println("Введите день недели (1-7)");
        int dayOfWeek = scanner.nextInt();
        switch (dayOfWeek) {
            case 1, 2, 3, 4, 5:
                System.out.println("Рабочий день");
                break;
            case 6, 7:
                System.out.println("Выходной");
                break;
            default:
                System.out.println("Something bad happened");
        }

//Задание 7 - Возрастная категория
//Запросите у пользователя возраст и распределите по категориям:

//0-2 → "Младенец"
//3-6 → "Дошкольник"
//7-17 → "Школьник"
//18-59 → "Взрослый"
//60+ → "
//Подсказка: Сначала вычислите категорию с помощью if-else, затем используйте switch для вывода.

        System.out.println("Введите свой возраст");
        int age = scanner.nextInt();
        String adult;

        if (age < 0) {
            adult = "negative";
        } else if (age >= 0 && age <= 2) {
            adult = "born";
        } else if (age > 2 && age <= 6) {
            adult = "young";
        }else if (age > 6 && age <= 17) {
            adult = "teenager";
        } else if (age > 17 && age <= 59) {
            adult = "adult";
        } else if (age > 59) {
            adult = "old";
        } else {
            adult = "err";
        }

        switch (adult) {
            case "born" -> {
                System.out.println("Младенец");
            }
            case "young" -> {
                System.out.println("Дошкольник");
            }
            case "teenager" -> {
                System.out.println("Школьник");
            }
            case "adult" -> {
                System.out.println("Взрослый");
            }
            case "old" -> {
                System.out.println("Пенсионер");
            }
            case "negative" -> {
                System.out.println("Отрицательное число");
            }
            default -> {
                System.out.println("Unknown error");
            }
        }


//Задание 8 - Квартал года
//Запросите у пользователя номер месяца (1-12). Выведите:

//1-3 → "1 квартал"
//4-6 → "2 квартал"
//7-9 → "3 квартал"
//10-12 → "4 квартал"

        System.out.println("Введите номер месяца");
        int m0nth = scanner.nextInt();

        switch (m0nth) {
            case 1:
            case 2:
            case 3:
                System.out.println("1 квартал");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("2 квартал");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("3 квартал");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("4 квартал");
                break;
            default:
                System.out.println("Unknown error");
        }

//hard

//Задание 9 - Калькулятор дат
//Запросите у пользователя:
//
//День (1-31)
//Месяц (1-12)
//Год
//
//Программа должна вычислить и вывести:
//
//Какой день недели был в этот день (используйте формулу или приблизительно) - НЕ ДЕЛАТЬ!
//Сколько дней прошло с начала года
//
//Подсказка:
//
//Используйте switch для определения количества дней в каждом месяце
//Учитывайте високосный год для февраля (год делится на 4)
//Суммируйте дни всех предыдущих месяцев + текущий день

        System.out.println("Введите день (1-31)");
        int day = scanner.nextInt();

        System.out.println("Введите месяц (1-12)");
        int month = scanner.nextInt();

        System.out.println("введите год");
        int year = scanner.nextInt();

        boolean leap;
        int totalDay = 0;


        if (year % 4 != 0) {
            leap = false;
        } else if (year % 100 != 0) {
            leap = true;
        } else {
            leap = year % 400 == 0;
        }

        for (; month >0; month--) {
            int counter = 0;

            if (month < 2) {
                continue;
            }

            if (month == 2) {
                if (leap) {
                    counter += 29;
                } else {
                    counter += 28;
                }
            } else if (month == 4 || month == 6 || month == 9 || month == 11) {
                counter += 30;
            } else if (month == 1 || month == 3 || month == 5 || month == 7
                    || month == 8 || month == 10 || month == 12) {
                counter += 31;
            } else {
                System.out.println("Wrong month number: " + month);
                return;
            }

            totalDay += counter;
        }
        System.out.println((totalDay + day) + ": дней прошло с начала года");

    }
}