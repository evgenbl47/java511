package homeWork;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {
    Scanner scanner = new Scanner(System.in);

    public void run() {
        System.out.println("run() - start");
//        notes();
//        shoppingList();
//        greetings();
//        stringOperation();
//        listFilter();
        System.out.println("run - end");
    }

    //        Задание 1: Программа "Заметки"
//Создайте программу с меню:
//Записать заметку (стирает старое содержимое файла)
//Добавить новую заметку (добавляет в конец файла)
//Прочитать все заметки
//        Выход
    public void notes() {
        String currentPath = "C:\\Users\\Мой дом\\IdeaProjects\\java511\\git\\Lesson29 FileWriter FileReader\\data\\file.txt";
        File file = new File(currentPath);
        boolean isRun = false;

        do {
            System.out.println("""
                    1 - Записать заметку (стирает старое содержимое файла)
                    2 - Добавить новую заметку (добавляет в конец файла)
                    3 - Прочитать все заметки
                    4 - Выход""");


            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException e) {
                    System.out.println("File isn't exist");
                    throw new RuntimeException(e);
                }
            }

            String userAnsfer = scanner.nextLine();
            int ansfer = Integer.parseInt(userAnsfer);

            if (ansfer == 1) {
                System.out.println("Записать заметку (стирает старое содержимое файла)");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentPath))) {
                    System.out.println("Type line to write: ");
                    String s = scanner.next();
                    writer.write(s);
                    writer.flush();

                } catch (IOException e) {
                    System.out.println("Write false");
                    throw new RuntimeException(e);
                }
            }

            if (ansfer == 2) {
                System.out.println("Добавить новую заметку (добавляет в конец файла)");
                try (BufferedWriter writer = new BufferedWriter(new FileWriter(currentPath, true))) {
                    System.out.print("Type line to write: ");
                    String s = scanner.nextLine();
                    writer.append(s);
                    writer.newLine();
                    writer.close();
                } catch (IOException e) {
                    System.out.println("Write false");
                    throw new RuntimeException(e);
                }
            }

            if (ansfer == 3) {
                System.out.println("Прочитать все заметки)");
                try (BufferedReader reader = new BufferedReader(new FileReader(currentPath))) {
                    String line;
                    while ((line = reader.readLine()) != null) {
                        System.out.println(line);
                    }

                } catch (Exception e) {
                    throw new RuntimeException(e);

                }
            }

            if (ansfer == 4) {
                System.out.println("Good bye!");
                isRun = false;
            }

        } while (isRun);
    }


//        Задание 2: Список покупок
//Создайте программу для управления списком покупок в файле "shopping.txt":

//Добавить товар
//Показать весь список
//Удалить все товары (очистить файл)
//Подсчитать количество товаров в списке
//        Выход

    //todo don't have enough time. do it in future
    public void shoppingList() {
        String currentPath = "C:\\Users\\Мой дом\\IdeaProjects\\java511\\git\\Lesson29 FileWriter FileReader\\data\\shopping.txt";
        File file = new File(currentPath);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                System.out.println("File isn't exist");
                throw new RuntimeException(e);
            }
        }

    }


//        Задание 3: Дневник событий
//Создайте программу-дневник:

//Добавить запись (формат: дата + описание события)
//Показать последние 5 записей
//Показать все записи
//Найти запись по ключевому слову
//        Выход
//todo don't have enough time. do it in future
    public void eventsDiary() {

    }


//-----------------------------------------------------------------------------------------
//Lyambda

//        Задание 1: Приветствия
//Создайте функциональный интерфейс Greetable с методом void greet().
//Напишите программу, которая создает 4 разных лямбда-выражения:

    //Выводит "Hello!"
//Выводит "Good morning!"
//Выводит "Привет!"
//Выводит текущую дату + приветствие
//Вызовите каждую лямбду.
    public void greetings() {
        @FunctionalInterface
        interface Greetable {
            void greet();
        }

        class Greet {
            List<String> list = new ArrayList<>();

            Greet() {
                start();
            }

            public void start() {
                String currentDate = "currentDate";
                list.add("Hello!");
                list.add("Good morning!");
                list.add("Привет!");
                list.add("currentDate" + " Hello!");
                for (String greetings : list) {
                    Greetable greetable = () -> System.out.println(greetings);
                    greetable.greet();
                }
            }
        }
        new Greet();
    }


//        Задание 2: Строковые операции
//Создайте функциональный интерфейс StringOperation с методом String apply(String s).
//Напишите программу с 5 лямбда-выражениями для строки:

    //Перевести в верхний регистр
//Перевести в нижний регистр
//Перевернуть строку задом наперед
//Удалить все пробелы
//Добавить в начало и конец строки символ "*"
//Протестируйте каждую лямбду на строке "Hello World".
    public void stringOperation() {
        @FunctionalInterface
        interface StringOperation {
            String apply(String s);
        }

        class Oper {

            Oper() {
                start();
            }

            void start() {
                String s = "Control MessagE";
                StringOperation upper = (a) -> s.toUpperCase();
                StringOperation lower = (a) -> s.toLowerCase();
                //                StringOperation reverse = (a) -> s.reverse();
                StringOperation change = (a) -> {
                    return "*" + s + "*";
                };
                StringOperation cutSpace = (a) -> {
                    return s.replace(" ", "");
                };

                System.out.println(upper.apply(s));
                System.out.println(lower.apply(s));
                System.out.println(cutSpace.apply(s));
                System.out.println(change.apply(s));
            }
        }

        new Oper();

    }

//        Задание 3: Фильтрация списка
//Создайте функциональный интерфейс StringChecker с методом boolean test(String s).
//Создайте ArrayList со строками: "Java", "Python", "JavaScript", "C++", "Ruby", "Go", "Kotlin"
//Напишите метод filter(List<String> list, StringChecker checker), который возвращает новый список строк, прошедших проверку.
//Создайте лямбда-выражения для фильтрации:
    public void listFilter() {
        @FunctionalInterface
        interface StringChecker {
            boolean test(String s);
        }

        class Oper {
            List<String> list = new ArrayList<>();

            Oper() {
                start();
            }

            public void start() {
                list.add("Java");
                list.add("Python");
                list.add("JavaScript");
                list.add("C++");
                list.add("Ruby");
                list.add("Go");
                list.add("Kotlin");

                System.out.println("длиной больше 4 символов");
                filter(list, s -> s.length() > 4);

                System.out.println("начинающихся с J");
                filter(list, s -> s.startsWith("J"));

                System.out.println("содержащих букву a");
                filter(list, s -> s.contains("a"));

                System.out.println("которые НЕ содержат букву y");
                filter(list, s -> !s.contains("y"));

                System.out.println("Строк длиной ровно 6 символов");
                filter(list, s -> s.length() == 6);
            }

            void filter(List<String> list, StringChecker checker) {
                for (String s : list) {
                    if (checker.test(s)) {
                        System.out.println(s);
                    }
                }
            }
        }
        new Oper();
    }
}
//Строк длиной больше 4 символов
//Строк, начинающихся с "J"
//Строк, содержащих букву "a"
//Строк, которые НЕ содержат букву "y"
//Строк длиной ровно 6 символов
