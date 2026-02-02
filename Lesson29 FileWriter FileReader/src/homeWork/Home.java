package homeWork;

import java.io.*;
import java.util.Scanner;

public class Home {
    Scanner scanner = new Scanner(System.in);

    public void run() {
//        notes();
        shoppingList();

    }

    //Задание 1: Программа "Заметки"
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


//Задание 2: Список покупок
//Создайте программу для управления списком покупок в файле "shopping.txt":

    //Добавить товар
//Показать весь список
//Удалить все товары (очистить файл)
//Подсчитать количество товаров в списке
//        Выход
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


//Задание 3: Дневник событий
//Создайте программу-дневник:

//Добавить запись (формат: дата + описание события)
//Показать последние 5 записей
//Показать все записи
//Найти запись по ключевому слову
//        Выход


//-----------------------------------------------------------------------------------------
//Lyambda
    @FunctionalInterface
    interface Greetable {
        void greet();

    }

    class Greet {
        Greetable greetable = () -> System.out.println("Hello");
//        Greetable greetable = () -> System.out.println("Good morning!");
//        Greetable greetable = () -> System.out.println("Привет!");
//        Greetable greetable = () -> System.out.println("Привет!");

    }

//Задание 1: Приветствия
//Создайте функциональный интерфейс Greetable с методом void greet().
//        Напишите программу, которая создает 4 разных лямбда-выражения:

//Выводит "Hello!"
//Выводит "Good morning!"
//Выводит "Привет!"
//Выводит текущую дату + приветствие

//Вызовите каждую лямбду.


//        Задание 2: Строковые операции
//Создайте функциональный интерфейс StringOperation с методом String apply(String s).
//Напишите программу с 5 лямбда-выражениями для строки:

//Перевести в верхний регистр
//Перевести в нижний регистр
//Перевернуть строку задом наперед
//Удалить все пробелы
//Добавить в начало и конец строки символ "*"

//Протестируйте каждую лямбду на строке "Hello World".


//Задание 3: Фильтрация списка
//Создайте функциональный интерфейс StringChecker с методом boolean test(String s).
//Создайте ArrayList со строками: "Java", "Python", "JavaScript", "C++", "Ruby", "Go", "Kotlin"
//Напишите метод filter(List<String> list, StringChecker checker), который возвращает новый список строк, прошедших проверку.
//Создайте лямбда-выражения для фильтрации:

//Строк длиной больше 4 символов
//Строк, начинающихся с "J"
//Строк, содержащих букву "a"
//Строк, которые НЕ содержат букву "y"
//Строк длиной ровно 6 символов

}