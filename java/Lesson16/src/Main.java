import java.util.Arrays;
import java.util.Scanner;

//20251125_194618
//try-catch
public class Main {

    public static int safeDivision(int a, int b) {
        int res = 0;

        try {
            res = a / b;
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
        return res;
    }

    public static int getElement(int[] arr, int index) {
        int res = 0;

        try {
            res = arr[index];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("");
            System.out.println("индекс выходит за границы массива");
            return -1;
        }

        return res;
    }

    public static int inputNumber(Scanner scanner) {

        boolean isNumCorrect = false;
        int number = 0;

        do {
            System.out.print("Type number                       :");
            String num = scanner.next();
            try {
                number = Integer.parseInt(num);
                isNumCorrect = true;
            } catch (NumberFormatException e) {
                System.out.println(e.getMessage());
            }
        } while (!isNumCorrect);

        return number;
    }

    public static int parseNumber(String numberStr) {
        int number = 0;
        try {
            number = Integer.parseInt(numberStr);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }

        return number;
    }

    public static void calculate(double a, double b, char operation) {
        if (operation == '+') {
            System.out.print(a + b);
            return;
        }
        if (operation == '-') {
            System.out.print(a - b);
            return;
        }
        if (operation == '*') {
            System.out.print(a * b);
            return;
        }
        if (operation == '/') {
            if (b == 0) {
                throw new IllegalArgumentException("Devide by 0");
            }
            System.out.print(a / b);
            return;
        }
        throw new IllegalArgumentException("Neizvestnaya operaciya");
    }

    public static boolean validateAge(int age) {
        if (age >= 0 && age <= 150) {
            return true;
        } else {
            throw new IllegalArgumentException("Age can be >= 0 && <= 150");
        }
    }


    public static void processArray(int[] arr, int index, int divisor) {
        int res;
        try {
            res = arr[index] / divisor;
            System.out.println(res);
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//        Задача 1: Деление на ноль
//        Создайте метод safeDivision(int a, int b), который делит два числа и обрабатывает деление на ноль через try-catch.
//        Метод должен возвращать результат деления или выводить сообщение об ошибке и возвращать 0.

        int res = safeDivision(10, 5);
        System.out.println("safeDivision(int a, int b)        :" + res);


//        Задача 2: Проверка массива
//        Создайте метод getElement(int[] arr, int index), который возвращает элемент массива по индексу.
//        Обработайте ситуацию, когда индекс выходит за границы массива (ArrayIndexOutOfBoundsException). При ошибке возвращайте -1.

        int elem;
        int index = 0;
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};
        elem = getElement(arr, index);
        System.out.println("getElement(arr, index)            :" + elem);


//        Задача 3: Безопасный ввод числа
//        Создайте метод inputNumber(*Scanner scanner, String message* ), который просит пользователя ввести целое число.
//        Если пользователь вводит не число (буквы, символы), программа должна перехватить исключение,
//        вывести сообщение об ошибке и повторить запрос. Метод возвращает корректно введённое число.
        System.out.println("inputNumber()                     :" + inputNumber(scanner));


//        Задача 4: Конвертер строки в число
//        Создайте метод parseNumber(String str), который преобразует строку в целое число.
//        Обработайте NumberFormatException - если строка не является числом, выведите сообщение об ошибке и верните 0.
//        Протестируйте метод со строками: "123", "abc", "12.5".
        System.out.println("parseNumber(123)                  :" + parseNumber("123"));

//                Задача 5: Калькулятор с исключениями
//        Создайте метод calculate(double a, double b, char operation), который выполняет арифметические операции (+, -, *, /).
//        Обработайте деление на ноль. Если передана неизвестная операция (например, '%'), бросьте исключение IllegalArgumentException с сообщением"Neizvestnaya operaciya".
        System.out.print("calculate(1, 0, /)                :");
        calculate(1, 0, '/');
        System.out.println();


//                Задача 6: Валидация возраста
//        Создайте метод validateAge(int age), который проверяет корректность возраста (должен быть от 0 до 150). Если возраст отрицательный или больше 150,
//        бросьте IllegalArgumentException с соответствующим сообщением. В методе main обработайте это исключение и выведите сообщение об ошибке.
        try {
            System.out.print("validateAge(50)                   :" + validateAge(50));
        } catch (IllegalArgumentException e) {
            System.out.println("validateAge(int age)              :" + e.getMessage());
        }
        System.out.println();

//        Задача 7: Множественные исключения
//Создайте метод processArray(int[] arr, int index, int divisor), который берёт элемент массива по индексу и делит его на divisor.
// Метод должен обрабатывать три типа исключений отдельными catch блоками:
//        NullPointerException - если массив null
//        ArrayIndexOutOfBoundsException - если индекс неверный
//        ArithmeticException - если делитель равен 0

//        При каждой ошибке выводите своё сообщение. Возвращайте результат деления или -1 при ошибке.
        int[] array = new int[]{2, 3};
        System.out.println("processArray(array, 50, 0)         :");
        processArray(array, 555, 5);
        System.out.println(Arrays.toString(array));


    }
}


//        try {
//        err();
//        } catch (IndexOutOfBoundsException e) {
//        } catch (ArithmeticException e) {
//        } catch (NullPointerException e) {
//        } catch (Exception e) {
//        } finally {
//        }

//        static void err() throws Exception {
//            throw new NoSuchMethodException();
//        }


//        Exception	Explanation

//        Exception Name	        What It Means
//        IndexOutOfBoundsException	Imagine a box with 5 toys. If you try to grab the 6th toy, you can't! This error happens when you ask for something that isn't there.
//        ArithmeticException	    If you have 10 candies and try to share them with 0 friends, you can't! This error happens when you try to do something silly, like divide by zero.
//        NullPointerException  	If you want to play with your toy but you forgot where you put it, you’d be confused. This error happens when you try to use something that doesn’t exist.
//        ClassCastException	    If you try to fit a big toy into a small box that doesn't match, it won't work! This error happens when you try to mix things that don't belong together.
//        IllegalArgumentException	If you try to wear shoes on your hands, that’s not right! This error happens when you use something in a way that isn’t allowed.
//        IOException	            It's like trying to talk to a friend, but you can't hear them because the phone is broken. This error happens when something goes wrong with talking to files or other stuff.
//        FileNotFoundException 	If you look for a storybook that’s not on the shelf, you will be sad. This error happens when a computer can’t find the file you’re looking for.
//        ArrayStoreException	    If you try to put a toy car in a box meant for stuffed animals, that doesn't fit! This error happens when you try to put the wrong kind of toy in a box.
//        NumberFormatException 	If you try to read a number from a toy label, but it’s written in a funny way, you won’t understand it. This error happens when a number is written wrong.
//        StackOverflowError	    If you keep piling up blocks on top of each other too high, they will fall down! This error happens when you ask to do too many things at once.owError	Thrown when the stack size exceeds its limit, usually due to deep recursion.