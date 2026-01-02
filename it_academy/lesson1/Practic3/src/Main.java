import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int secretKeyCandidate = 0;

        while (secretKeyCandidate != -1) {
            System.out.println("Type a number:");
            // Создаем Scanner для чтения числа с клавиатуры
            secretKeyCandidate = console.nextInt();

            // Числа <= 1 не являются простыми
            if (secretKeyCandidate <= 1) {
                System.out.println("NO");
                return;
            }

            boolean isPrime = true;


            // Проверяем делители от 2 до sqrt(n).
            // Условие i <= n / i эквивалентно i*i <= n, но без риска переполнения int.
            for (int i = 2; i <= secretKeyCandidate / i; i++) {
                if (secretKeyCandidate % i == 0) { // Нашли делитель — число составное
                    isPrime = false;
                    break;
                }
            }

            // Выводим результат проверки
            System.out.println(isPrime ? "YES" : "NO");
        }

    }
}