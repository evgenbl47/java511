import model.Contact;
import model.Gender;
import model.User;
import repository.FileManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        testContact();
//        System.out.println("test Contact - done");
//        testUser();
//        System.out.println("test User - done");
//        testFileManager();
//        System.out.println("test FileManager - done");
        run();

    }

    public static void testContact() {
        List<String> contactPhones = new ArrayList<>();
        contactPhones.add("+71234567890");
        contactPhones.add("+77712345678");

//        (String name, String surname, int age, Gender gender, String email, List<String> phoneNumbers)
        Contact testContact = new Contact("Name", "Surname", 20, Gender.MALE, "email", contactPhones);
        Contact testContact2 = new Contact("Name2", "Surname2", 22, Gender.FEMALE, "email", contactPhones);
        System.out.println(testContact);
        System.out.println(testContact2);
    }

    public static void testUser() {
        //        User(String firstName, String lastName, String username, String password)
        User user1 = new User("admin", "pass1", "Alex", "Petrov");
        User user2 = new User("guest", "pass2", "Dima", "Ivanov");
        System.out.println(user1);
        System.out.println(user2);

        String inputLogin = "admin";
        String inputPassword = "pass1";

        if (user1.getLogin().equals(inputLogin) && user1.getPassword().equals(inputPassword)) {
            System.out.printf("✅ Login successful. Welcome, %s! ", user1.getFirstName());
        } else {
            System.out.println("❌ Access denied. Invalid username or password.");
        }
    }

    public static void testFileManager() {
        FileManager fileManager = new FileManager();

        User user1 = new User("admin", "pass1", "Alex", "Petrov");
        User user2 = new User("guest", "pass2", "Dima", "Ivanov");

        fileManager.saveUser(user1);
        fileManager.saveUser(user2);
        System.out.println("✅ Users saved to file.");

        List<User> loadedUsers = fileManager.loadUsers();
        System.out.println("--- Loaded Users ---");
        loadedUsers.forEach(System.out::println);

        if (loadedUsers.size() == 2) {
            System.out.println("🎉 Success! All users recovered.");
        } else {
            System.out.println("⚠️ Warning: User count mismatch!");
        }
    }

    public static void run() {
        User currentUser = null;
        FileManager fileManager = new FileManager();
        Scanner scanner = new Scanner(System.in);
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
            userChoise = Integer.parseInt(scanner.nextLine());

            if (userChoise == 1) {
                boolean login = true;
                System.out.println("Login");
                System.out.println("Enter login");
                String userLogin = scanner.nextLine();
                System.out.println("Enter password");
                String userPassword = scanner.nextLine();

                List<User> users = fileManager.loadUsers();
                Optional<User> foundUser = users.stream()
                        .filter(u -> u.getLogin().equals(userLogin) && u.getPassword().equals(userPassword))
                        .findFirst();

                if (foundUser.isPresent()) {
                    currentUser = foundUser.get();
                    System.out.printf("Welcome, %s!\n", currentUser.getFirstName());
                    login = true;
                }else {
                    System.out.println("❌ Invalid login or password");
                    login = false;
                }




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
                    userChoise = Integer.parseInt(scanner.nextLine());
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
                        //logger.makeLog("Create log");

                    }

                    if (userChoise == 6) {
                        System.out.println("Back");
                        login = false;
                        currentUser = null;
                    }
                }
            }

            if (userChoise == 2) {
                System.out.println("Registration");
                System.out.println("Enter name");
                String name = scanner.nextLine();
                System.out.println("Enter surname");
                String surname = scanner.nextLine();
                System.out.println("Enter login");
                String login = scanner.nextLine();
                System.out.println("Enter passowrd");
                String password = scanner.nextLine();

                List<User> users = fileManager.loadUsers();

                boolean isTaken = users.stream().anyMatch(u -> u.getLogin().equals(login));
                if (isTaken) {
                    System.out.printf("❌ Error: Username %s is already taken!", login);
                } else {
                    User newUser = new User(login, password, name, surname);
                    fileManager.saveUser(newUser);
                    System.out.println("✅ Registration successful!");
                }

            }

            if (userChoise == 3) {
                System.out.println("Exit");
                run = false;
            }
        } while (run);

    }

}