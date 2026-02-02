package lection;

@FunctionalInterface
interface Testable {
    //    void test();
    int operation(int a, int b);
}

interface Checkable {
    boolean check(int a);
}

public class CLambda {
    void run() {
//        Testable addition = (a, b) -> a + b;
//        Testable subtract = (a, b) -> a - b;
//        Testable divide   = (a, b) -> a / b;
//        Testable multyply = (a, b) -> a * b;

//        Testable other = (a, b) -> {
//            a -= b;
//            a += b;
//            return b;
//        };

//        divide.operation(20, 10);
//        addition.operation(1, 2);

//        System.out.println("hello");



        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        print(arr, (x) -> true);
        print(arr, (x) -> x % 2 == 0);
        print(arr, (x) -> x % 2 != 0);
        print(arr, (x) -> x > 5);
        print(arr, (x) -> x < 5);
        print(arr, (x) -> x == 5);
        print(arr, (x) -> x == 5);
    }

    public void print(int[] arr, Checkable checkable) {
        for (int i : arr) {
            if (checkable.check(i)) {
                System.out.println(i + " ");
            }
        }
    }

    public void printEven(int[] arr) {
        for (int i : arr) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public void printOdd(int[] arr) {
        for (int i : arr) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }


}


