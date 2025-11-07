public class Main {
    public static void main(String[] args) {
        char symbol = '*';
        char space = ' ';

        System.out.print("1\n");

//1
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.printf("%c%c", symbol, space);
            }
            System.out.println();
        }

        System.out.print("\n2\n");

//2
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.printf("%c", space);
            }
            System.out.print(symbol);
            System.out.println();
        }

        System.out.print("\n3\n");

//3
        for (int i = 0; i < 8; i++) {
            for (int j = 8; j > i; j--) {
                System.out.printf("%c", space);
            }
            System.out.print(symbol);
            System.out.println();
        }

        System.out.print("\n4\n");

//4
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.printf("%c", symbol);
            }
            System.out.println();
        }

        System.out.print("\n5\n");

//5
        for (int i = 0; i < 8; i++) {
            for (int j = 7 - i; j > 0; j--) {
                System.out.printf("%c", symbol);
            }
            System.out.println();
        }

        System.out.print("\n6\n");

//6
        int size = 8;
        for (int i = 1; i < size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(space);
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.printf("%c", symbol);
            }

            System.out.println();
        }

        System.out.print("\n7\n");

//7
        size = 12;
        for (int i = 0, k = size; i <= size; i++, k--) {
            if (i < size / 2) {
                for (int j = size / 2; j > i; j--) {
                    System.out.print(space);
                }
            } else {
                for (int j = size / 2; j < i; j++) {
                    System.out.print(space);
                }

            }
            if (i < size / 2) {
                for (int j = 0; j <= i * 2; j++) {
                    System.out.printf("%c", symbol);
                }
            } else {
                for (int j = 0; j <= k * 2; j++) {
                    System.out.printf("%c", symbol);
                }
            }
            System.out.println();
        }

        System.out.println();

    }

}