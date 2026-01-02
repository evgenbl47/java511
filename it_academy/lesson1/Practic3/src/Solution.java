import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int pyramidHeight = scanner.nextInt();

        for (int i = 0; i < pyramidHeight; i++) {
            System.out.print(" ".repeat(pyramidHeight - 1 - i));
            System.out.print("*".repeat((i * 2) + 1) + "\n");
        }
    }
}
