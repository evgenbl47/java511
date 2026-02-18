import tmp.Runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Runner runner = new Runner();
        runner.run();

    }

    public static void run() {
        Scanner scanner = new Scanner(System.in);
        List<Contact1> contacts = new ArrayList<>();
        List<User> users = new ArrayList<>();
        boolean run = true;
        int userChoise;

        do {
            System.out.println("""
                     -----------------------------------
                    |                                  |
                    |        1   -   Sign in           |
                    |                                  |
                    |        2   -   Sign up           |
                    |                                  |
                    |        3   -   Exit              |
                    |                                  |
                     -----------------------------------""");
            userChoise = scanner.nextInt();

            if (userChoise == 1) {
                boolean login = true;
                System.out.println("Login");
                System.out.println("Enter userName");
                String userName = scanner.nextLine();
                System.out.println("Enter userLogin");
                String userLogin = scanner.nextLine();
                while (login) {
                    System.out.println("""
                     -----------------------------------
                    |                                  |
                    |        1   -   Contacts          |
                    |        2   -   Search            |
                    |        3   -   Filter            |
                    |        4   -   Sort              |
                    |        5   -   Logger            |
                    |        6   -   Back              |
                    |                                  |
                     -----------------------------------""");
                    userChoise = scanner.nextInt();
                    if (userChoise == 1) {
                        System.out.println("Contacts");
                        System.out.println("""
                     -----------------------------------
                    |                                  |
                    |        1   -   Add               |
                    |        2   -   Remove            |
                    |        3   -   Edit              |
                    |        4   -   Display           |
                    |                                  |
                     -----------------------------------""");

                    }

                    if (userChoise == 2) {
                        System.out.println("Search");
                        System.out.println("""
                     -----------------------------------
                    |                                  |
                    |        1   -   Registr On/Off    |
                    |        2   -   ByName            |
                    |        3   -   BySurname         |
                    |        4   -   ByNumber          |
                    |        5   -   All param         |
                    |        6   -   Use symb(_ , %)   |
                    |                                  |
                     -----------------------------------""");
                    }

                    if (userChoise == 3) {
                        System.out.println("Filter");
                        System.out.println("""
                     -----------------------------------
                    |                                  |
                    |        1   -   Only men          |
                    |        2   -   Only women        |
                    |        3   -   Age more than n   |
                    |        4   -   Age lower than n  |
                    |                                  |
                     -----------------------------------""");
                        System.out.println("1 - только мужчины 2 только женщины , 3 возраст больше n, 4 возраст меньше n");
                    }

                    if (userChoise == 4) {
                        System.out.println("Sort");
                    }

                    if (userChoise == 5) {
                        System.out.println("Logger");
                    }

                    if (userChoise == 6) {
                        System.out.println("Back");
                        login = false;
                    }
                }
            }

            if (userChoise == 2) {
                System.out.println("Register");
                System.out.println("Enter username");
                System.out.println("Enter surname");
                System.out.println("Enter login");
                System.out.println("Enter passowrd");

            }

            if (userChoise == 3) {
                System.out.println("Exit");
                run = false;
            }
        } while (run);

    }

}