import java.util.Random;

public class Main {

    public static void run() {
        int[] arr = arrCreate(5, 0, 20);
        arrShow(arr);
        System.out.println();
        System.out.println("Sum of array: " + arrSum(arr));
        System.out.println("Amount positive numbers: " +arrShowAmountPositive(arr));
        System.out.println("Max element: " + arrFindMax(arr));
        System.out.println("Min element: " + arrFindMin(arr));
    }
//        Задание 1
//        Написать метод, который создает массив из N случайных чисел в диапазоне от min до max и возвращает этот массив.
    public static int[] arrCreate(int size, int min, int max) {
        Random random = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(min, max);
        }
        return arr;
    }
//        Задание 2
//        Написать метод, который принимает массив и выводит все его элементы на экран в одну строку через пробел.
    public static void arrShow(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

//        Задание 3
//        Написать метод, который принимает массив и возвращает сумму всех его элементов.
    public static int arrSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    //        Задание 4
//        Написать метод, который принимает массив и возвращает количество положительных элементов в нем.
    public static int arrShowAmountPositive(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                sum++;
            }
        }
        return sum;
    }


//        Задание 5
//        Написать метод, который принимает массив и возвращает максимальный элемент.
    public static int arrFindMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
//        Задание 6
//        Написать метод, который принимает массив и возвращает минимальный элемент.
public static int arrFindMin(int[] arr) {
    int min = arr[0];
    for (int i = 1; i < arr.length; i++) {
        if (min > arr[i]) {
            min = arr[i];
        }
    }
    return min;
}

//        Задание 7
//        Написать метод, который принимает массив и возвращает среднее арифметическое всех элементов.

//        Задание 8
//        Написать метод, который принимает массив и возвращает количество четных чисел в нем.
//
//        Задание 9
//        Написать метод, который принимает массив и возвращает индекс максимального элемента.
//
//        Задание 10
//        Написать метод, который принимает массив и выводит только положительные элементы на экран.
//
//        Задание 11
//        Написать метод, который принимает массив и возвращает новый массив в обратном порядке.
//
//        Задание 12
//        Написать метод, который принимает массив и число, возвращает количество элементов равных этому числу.
//
//        Задание 13
//        Написать метод, который принимает массив и заменяет все отрицательные элементы на нули.
//
//        Задание 14
//        Написать метод, который принимает два массива и возвращает true, если их суммы элементов равны, иначе false.
//
//        Задание 15
//        Написать метод, который принимает массив и возвращает разницу между максимальным и минимальным элементом.

    public static void main(String[] args) {
        run();
        }
    }
