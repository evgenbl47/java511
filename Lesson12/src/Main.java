public class Main {
    //    Задание 1
//    Написать перегруженные методы multiply, которые могут умножать два int числа, два double числа, три int числа, или int и double число.
    public static int multiply(int first, int second) {
        int sum = first * second;
        return sum;
    }

    public static double multiply(double first, double second) {
        double sum = first * second;
        return sum;
    }

    public static int multiply(int first, int second, int third) {
        int sum = first * second * third;
        return sum;

    }

    public static double multiply(int first, double second) {
        double sum = first * second;
        return sum;
    }

    //    Задание 2
//    Написать рекурсивный метод, который вычисляет сумму чисел от 1 до N.
    public static int getSum(int n) {
        if (n == 1) {
            return 1;
        }
        int sum = n + getSum(n - 1);
        return sum;
    }

    //    Задание 3
//    Написать метод, который принимает массив и число X, и возвращает true если в массиве есть элемент больше X, иначе false.
    public static boolean arrHasMax(int[] arr, int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > n) {
                return true;
            }
        }
        return false;
    }

    //    Задание 4
//    Написать рекурсивный метод, который выводит числа от N до 1 в обратном порядке (каждое на новой строке).
    public static void showNumsReverse(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        showNumsReverse(n - 1);
    }

    //    Задание 5
//    Написать перегруженные методы printInfo, один принимает строку и выводит её, второй принимает строку и число и выводит строку N раз.
    public static void printInfo(String str) {
        System.out.println(str);
    }

    public static void printInfo(String str, int count) {
        for (int i = 0; i < count; i++) {
            printInfo(str);
        }
    }

//    Задание 6
//    Написать рекурсивный метод, который принимает массив и индекс, и возвращает сумму всех элементов массива начиная с этого индекса до конца.



    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 0};
//    Задание 7
//    Написать метод, который принимает два числа A и B, и возвращает их произведение используя только операцию сложения (без использования *).
//    Задание 8
//    Написать рекурсивный метод, который принимает массив и индекс, и возвращает максимальный элемент в массиве начиная с этого индекса.
//    Задание 9
//    Написать перегруженные методы calculate: один складывает два числа, второй вычитает второе из первого, третий принимает три числа и возвращает их среднее арифметическое.
//    Задание 10
//    Написать рекурсивный метод, который вычисляет степень числа: возводит число A в степень N (A^N).
    }
}