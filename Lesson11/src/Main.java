import java.util.Random;

public class Main {

    public static void run() {
        int[] arr = arrCreate(5, 0, 20);
        System.out.print("Array: ");
        arrShow(arr);
        System.out.println("\nSum of array: " + arrSum(arr));
        System.out.println("Amount positive numbers: " + arrShowAmountPositive(arr));
        System.out.println("Max element: " + arrFindMax(arr));
        System.out.println("Min element: " + arrFindMin(arr));
        System.out.println("Average: " + arrAverage(arr));
        System.out.println("Even amount: " + arrEven(arr));
        System.out.println("Max ID: " + arrFindMaxID(arr));
        System.out.print("Show only positive: ");
        arrOnlyPositive(arr);
        System.out.print("\nShow reverse arr: ");
        arrShow(arrReverse(arr));
        System.out.println("\nFind equal numbers: " + arrFindByNum(arr, 10));
        System.out.print("After remove negative: ");
        arrRemoveNegative(arr);
        arrShow(arr);
        System.out.println("\nArrays equal: " + arrSumEqualArr(arrCreate(2, 0, 2), arrCreate(2, 0, 2)));
        System.out.println("Difference max - min: " + arrDiffMaxMin(arr));
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
    public static int arrAverage(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count = count + arr[i];
        }
        int result = count / arr.length;
        return result;
    }

    //        Задание 8
//        Написать метод, который принимает массив и возвращает количество четных чисел в нем.
    public static int arrEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    //        Задание 9
//        Написать метод, который принимает массив и возвращает индекс максимального элемента.
    public static int arrFindMaxID(int[] arr) {
        int maxID = 0;
        int maxElement = arrFindMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (maxElement == arr[i]) {
                maxID = i;
            }
        }
        return maxID;
    }

    //        Задание 10
//        Написать метод, который принимает массив и выводит только положительные элементы на экран.
    public static void arrOnlyPositive(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.print(arr[i] + " ");
            }
        }
    }

    //        Задание 11
//        Написать метод, который принимает массив и возвращает новый массив в обратном порядке.
    public static int[] arrReverse(int[] arr) {
        int[] arrReverse = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arrReverse[arr.length - 1 - i] = arr[i];
        }
        return arrReverse;
    }

    //        Задание 12
//        Написать метод, который принимает массив и число, возвращает количество элементов равных этому числу.
    public static int arrFindByNum(int[] arr, int num) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                count++;
            }
        }
        return count;
    }

    //        Задание 13
//        Написать метод, который принимает массив и заменяет все отрицательные элементы на нули.
    public static void arrRemoveNegative(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                arr[i] = 0;
            }
        }
    }

    //        Задание 14
//        Написать метод, который принимает два массива и возвращает true, если их суммы элементов равны, иначе false.
    public static boolean arrSumEqualArr(int[] first, int[] second) {
        if (arrSum(first) == arrSum(second)) {
            return true;
        }return false;
    }

    //        Задание 15
//        Написать метод, который принимает массив и возвращает разницу между максимальным и минимальным элементом.
    public static int arrDiffMaxMin(int[] arr) {
        int diff = arrFindMax(arr) - arrFindMin(arr);
        return diff;
    }


    public static void main(String[] args) {
        run();
    }
}
