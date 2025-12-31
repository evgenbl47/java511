import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                // Просим пользователя ввести целое число больше 1
                System.out.print("Введите целое число больше 1: ");
                int n = scanner.nextInt();

                // Проверяем, является ли число простым
                if(n <= 1){
                    return;
                }

                boolean hasDivisor = false;


                // Цикл для поиска первого делителя числа n
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) { // Если n делится на i без остатка
                        // Выводим первый найденный делитель
                        System.out.println(i);
                        // Устанавливаем флаг, что число не простое
                        hasDivisor = true;
                        // Завершаем цикл, так как делитель найден
                        break;
                    }
                }

                // Если делитель не найден, выводим, что число простое
                if (!hasDivisor) {
                    System.out.println("Число простое");
                }
            }
        }
