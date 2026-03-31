import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int count;
        int start, end;

        //1. Четные числа
        //Напишите программу, которая считывает число N и выводит все четные числа от 1 до N.

       System.out.print("Enter positive number: ");
        num = scanner.nextInt();
        if (num > 1) {
            for (int i = 1; i < num; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                }
            }
        }

        //2. Не четные числа
        //Напишите программу, которая считывает число N и выводит все не четные числа от 1 до N.
        System.out.print("\nEnter positive number: ");
        num = scanner.nextInt();
        if (num > 1) {
            for (int i = 1; i < num; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }
            }
        }


        //3. Количество не четных чисел
        //Напишите программу, которая считывает число N и выводит Количество не четных числел от 1 до N.
        System.out.print("\nEnter positive number: ");
        count = 0;
        num = scanner.nextInt();
        if (num > 1) {
            for (int i = 1; i < num; i++) {
                if (i % 2 != 0) {
                    count++;
                }
            }
        }
        System.out.println("Количество не четных числел: " + count);

        //4. Количество четных чисел
        //Напишите программу, которая считывает число N и выводит Количество четных числел от 1 до N.
        System.out.print("\nEnter positive number: ");
        count = 0;
        num = scanner.nextInt();
        if (num > 1) {
            for (int i = 1; i < num; i++) {
                if (i % 2 == 0) {
                    count++;
                }
            }
        }
        System.out.println("Количество четных числел: " + count);

        //5. Сумма положительных
        //Программа считывает N-N чисел (Где начало и конец вводит пользователь). Найдите сумму только положительных чисел.
        System.out.print("Enter start number: ");
        start = scanner.nextInt();
        System.out.print("Enter end number: ");
        end = scanner.nextInt();

            for (int i = start; i <= end; i++) {
                if (i > 0) {
                    count = count + i;
                }
            }
        System.out.println("Сумма только положительных чисел: " + count);

        //6. Сумма отрицательных
        //Программа считывает N-N чисел (Где начало и конец вводит пользователь). Найдите сумму только отрицательных чисел.
        System.out.print("Enter start number: ");
        start = scanner.nextInt();
        System.out.print("Enter end number: ");
        end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            if (i < 0) {
                count = count + i;
            }
        }
        System.out.println("Сумма только отрицательных чисел: " + count);

        //7. Таблица умножения
        //Считайте число N и выведите таблицу умножения для этого числа (от 1 до 10).
        System.out.print("Enter positive number: ");
        num = scanner.nextInt();
        if (num > 1) {
            for (int i = 0; i <= 10; i++) {

                    System.out.println(num + " * " + i + " = " + num * i);

            }
        }



        //8. Сумма положительных
        //Программа считывает N-N чисел (Где начало и конец вводит пользователь). Найдите количество
        //-положительных
        //-отрицательных
        //-четных
        //-не четных
        //-числа которые деляться на 3 и на 4 без остатка
        //-числа которые деляться на 4 и на 5 без остатка
        //-числа которые деляться на 2 и на 7 без остатка
        //-числа которые деляться на 3 или на 4 без остатка
        //-числа которые деляться на 5 или на 7 без остатка

        System.out.print("Enter start number: ");
        start = scanner.nextInt();
        System.out.print("Enter end number: ");
        end = scanner.nextInt();
        int countPositive = 0, countNegative = 0;
        int even = 0, odd = 0;
        int divideBy_3_4 = 0, divideBy_4_5 = 0, divideBy_2_7 = 0, divideBy_5_7 = 0;

        for (int i = start; i <= end; i++) {
            if (i > 0) {
                countPositive++;
            }
            if (i < 0) {
                countNegative++;
            }
            if (i % 2 == 0) {
                even++;
            }
            if (i % 2 != 0) {
                odd++;
            }
            if (i / 3 == 0 && i / 4 == 0) {
                divideBy_3_4++;
            }
            if (i / 4 == 0 && i / 5 == 0) {
                divideBy_4_5++;
            }
            if (i / 2 == 0 && i / 7 == 0) {
                divideBy_2_7++;
            }
            if (i / 5 == 0 && i / 7 == 0) {
                divideBy_5_7++;
            }
        }
        System.out.println("positive: " + countPositive +
                ", negative: " + countNegative +
                ", even: " + even +
                ", odd: " + odd +
                ", divide by 3 and 4: " + divideBy_3_4 +
                ", divide by 4 and 5: " + divideBy_4_5 +
                ", divide by 2 and 7: " + divideBy_2_7 +
                ", divide by 5 and 7: " + divideBy_5_7);
    }
}