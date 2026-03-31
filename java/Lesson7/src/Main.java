public class Main {
    public static void main(String[] args) {
        char symbol = '*';
        char space = ' ';

        System.out.print("1\n");

//1
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == 0 || i == 7 || j == 0 || j == 4) {
                    System.out.printf("%c%c", symbol, space);
                } else {
                    System.out.printf("%c%c", space, space);
                }
            }
            System.out.println();
        }

        System.out.print("\n4\n");

//4
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == 0 || i == 7 || j == 0 || j == i) {
                    System.out.printf("%c", symbol);
                } else {
                    System.out.printf("%c", space);
                }
            }
            System.out.println();
        }

        System.out.print("\n5\n");

//5
        for (int i = 0; i < 8; i++) {
            for (int j = 8 - i; j > 0; j--) {
                if (i == 0 || i == 7 || j == 8 - i || j == 1) {
                    System.out.printf("%c", symbol);
                } else {
                    System.out.printf("%c", space);
                }
            }
            System.out.println();
        }

        System.out.print("\n6\n");

//6
        int size = 8;
        int q = 0;
        for (int i = 1; i < size; i++) {
            for (int j = size; j > i; j--) {
                System.out.print(space);
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                if (i == 1 || i == size - 1 || j == 0 || j == q) {
                    System.out.printf("%c", symbol);
                } else {
                    System.out.print(" ");
                }
            }
            q = q + 2;

            System.out.println();
        }

        System.out.print("\n7\n");

        //7
        size = 12;
        int moveSign = 0;
        boolean backward = true;
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
                    if (j == 0 || j == size - 1 || j == moveSign) {
                        System.out.printf("%c", symbol);
                    } else {
                        System.out.print(" ");
                    }
                }
            } else {
                for (int j = 0; j <= k * 2; j++) {
                    if (j == 0 || j == size || j == moveSign) {
                        System.out.printf("%c", symbol);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
            if (backward) {
                moveSign = moveSign + 2;
                if (moveSign == 12) {
                    backward = false;
                }
            } else {
                moveSign = moveSign - 2;
            }
        }
        System.out.println();

    }
}
