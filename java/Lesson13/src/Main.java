import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int find, min = 0, max = 100, rand, counter = 0;
        String name;
        boolean isHelp = true;
        boolean isTry = false;


        System.out.println("Welcome to game ==Guess Number==");
        System.out.print("Type your name: ");
        name = scanner.nextLine();

        do {
            System.out.println("Choose option");
            System.out.println("1 - Computer guess");
            System.out.println("2 - Human guess");
            System.out.println("3 - Help " + (isHelp?"(on)":"(off)"));
            System.out.println("4 - Try " + (isTry?"(on)":"(off)"));
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
                System.out.println("GoodBye, see you later");
                break;
            }

            if (select == 1) {
                counter = 0;
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

                    if (counter > 4) {
                        System.out.println("Your try empty");
                        break;
                    }

                    rand = random.nextInt(max - min + 1) + min;
                    System.out.println("Computer type number: " + rand);

                    if (isTry) {
                        System.out.println("Try amount: " + counter);
                        counter++;
                    }

                    if (rand == find) {
                        System.out.println("Computer guess, number: " + find);
                        break;
                    }

                    if (isHelp) {
                        System.out.println("1 - Bigger");
                        System.out.println("2 - Lower");
                        select = scanner.nextInt();
                        if (select == 1) {
                            min = rand + 1;
                            System.out.println("Bigger needed");
                        } else if (select == 2) {
                            max = rand - 1;
                            System.out.println("Lower needed");
                        } else if (select == -1) {
                            break;
                        }
                    } else {
                        System.out.println("Not the point try again");
                    }

                } while (true);

            }

            if (select == 2) {

            }

            if (select == 3) {
                System.out.println("Change help");
                System.out.println("1 - Turn on");
                System.out.println("2 - Turn off");
                select = scanner.nextInt();

                if (select == 1) {
                    isHelp = true;
                } else isHelp = false;


            }

            if (select == 4) {
                System.out.println("Change try");
                System.out.println("1 - Turn on");
                System.out.println("2 - Turn off");
                select = scanner.nextInt();

                if (select == 1) {
                    isTry = true;
                } else isTry = false;
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