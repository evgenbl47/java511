import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int find, min = 0, max = 100, rand;
        String name;

        System.out.println("Welcome to game ==Guess Number==");
        System.out.print("Type your name: ");
        name = scanner.nextLine();

        do {
            System.out.println("Choose option");
            System.out.println("1 - Computer guess");
            System.out.println("2 - Human guess");
            System.out.println("3 - Help (off)");
            System.out.println("4 - Try (off)");
            System.out.println("5 - Range (" + min + " - " + max + ")");
            System.out.println("6 - Exit");

            int select = scanner.nextInt();

            if (select == 5) {
                System.out.println("Change range");
                do {
                    System.out.println("Type min number: ");
                    int minNumber = scanner.nextInt();
                    System.out.println("Type max number: ");
                    int maxNumber = scanner.nextInt();

                    if (minNumber < maxNumber) {
                        min = minNumber;
                        max = maxNumber;
                        System.out.println("New diapason: " + min + " - " + max + ")");
                        break;
                    } else {
                        System.out.println("New diapason do not applied");
                        break;
                    }
                } while (true);
            }

            if (select == 6) {
                System.out.println("GoodBye, se you later");
                break;
            } else if (select == 1) {
                System.out.println("Welcome " + name + " to Human-Computer game");
                System.out.println(name + " guess a number: ");
                do {
                    find = scanner.nextInt();
                    if (find >= min && find <= max) {
                        System.out.println("Number: " + find + " applied");
                        break;
                    } else {
                        System.out.println("Incorrect range (" + min + " - " + max + ")");
                    }
                } while (true);

                do {
                    rand = random.nextInt(max - min + 1) + min;
                    System.out.println("Computer type number: " + rand);

                    if (rand == find) {
                        System.out.println("Computer guess, number: " + find);
                        break;
                    }

                    System.out.println("1 - Bigger");
                    System.out.println("2 - Lower");
                    select = scanner.nextInt();
                    if (select == 1) {
                        min = rand + 1;
                        System.out.println("Bigger needed");
                    } else if (select == 2) {
                        max = rand - 1;
                        System.out.println("Lower needed");
                    }
                } while (true);

            }
        }while (true);

    }
}


/*

// 1 - Start
        // 2 - Подсказки (off)
        // 3 - Попытки (off)
        // 4 - Диапазон (0-100)


        //1 Человек-Компютер
        //2 Компютер-Человек

        //1 Человек-Компютер
        //Введите имя : Фарид
        //Фарид загадай число : 66

        //Компютер угадывает число : 10

        //1 - Больше
        //2 - Меньше

        //Ответ : 1

        //Компютер угадывает число : 70

        //1 - Больше
        //2 - Меньше

        //Ответ : 2

        //Компютер угадывает число : 66

        //Урра компютер угадал число с 5 попыток


        /// ///////////////////////////////////////////////////////////////////////////////////////////////
        //Uqaday

        //1 Человек-Компютер
        //2 Компютер-Человек

        //1 Человек-Компютер
        //Введите имя : Фарид
        //Фарид загадай число : 66
        //Компютер угадывает число : 10
            //1 - Больше
            //2 - Меньше

        //Ответ : 1
        //Компютер угадывает число : 70

        //1 - Больше
        //2 - Меньше

        //Ответ : 2

        //Компютер угадывает число : 66
        //Урра компютер угадал число с 5 попыток


        /// ///////////////////////////////////////////////////////////////////////////////////////////////


        //2 Компютер-Человек
        //Введите имя : Фарид
        //Фарид компютер загадал число : x . Постарайтесь найти его!  (x = 33)

        //Фарид введи число : 10
        //Больше

        //Фарид введи число : 40
        //Меньше

        //Фарид введи число : 33


        //Урра Фарид угадал число с 3 попыток


        /// ///////////////////////////////////////////////////////////////////////////////////////////

        //***

        // 1 - Start
        // 2 - Подсказки (off)
        // 3 - Попытки (off)
        // 4 - Диапазон (0-100)
 */