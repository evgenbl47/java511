import model.Contact;
import model.Gender;
import model.User;
import repository.FileManager;
import service.AuthService;
import service.ContactService;
import java.util.ArrayList;
import java.util.List;
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
        Contact testContact = new Contact("Tom", "Smith", 20, Gender.MALE, "tom@test_email", contactPhones);
        Contact testContact2 = new Contact("Eva", "Burty", 22, Gender.FEMALE, "eva@test_email", contactPhones);
        System.out.println(testContact);
        System.out.println(testContact2);

        FileManager fileManager = new FileManager();
        fileManager.saveContact(testContact, "");
        fileManager.saveContact(testContact2, "evgenbl47");

        List<Contact> loaded = fileManager.loadContacts("Eva");
        System.out.println("------Loaded Contacts ------");
        loaded.forEach(System.out::println);
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
        ContactService contactService = new ContactService(fileManager);
        AuthService authService = new AuthService(fileManager);
        Scanner scanner = new Scanner(System.in);
        boolean run = true;
        int userChoise;

        do {
            printLoginPage();
            userChoise = Integer.parseInt(scanner.nextLine());

            if (userChoise == 1) {
                boolean login = true;
                System.out.println("Login");
                System.out.println("Enter login");
                String inputLogin = scanner.nextLine();
                System.out.println("Enter password");
                String inputPassword = scanner.nextLine();

                currentUser = authService.login(inputLogin, inputPassword);
                if (currentUser != null) {
                    System.out.printf("Welcome, %s!\n", currentUser.getFirstName());
                    login = true;
                } else {
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
                    showContactMenu();
                        int contactMenuChoice = Integer.parseInt(scanner.nextLine());

                        if (contactMenuChoice == 1) {
//                            System.out.println("Add");
                            addContact(scanner, currentUser, contactService);
                        }
                        if (contactMenuChoice == 2) {
//                            System.out.println("Remove");
                        }
                        if (contactMenuChoice == 3) {
//                            System.out.println("Edit");
                        }
                        if (contactMenuChoice == 4) {
//                            System.out.println("Display");
                            //displayContact();
                            List<Contact> contacts = contactService.getContacts(currentUser.getLogin());
                            if (contacts.isEmpty()) {
                                System.out.println("No contacts");
                            } else {
                                for (int i = 0; i < contacts.size(); i++) {
                                    int displayNumber = i + 1;
                                    Contact contact = contacts.get(i);
                                    System.out.printf("%d | %s%n", displayNumber, contact);
                                }
                            }
                        }
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

                boolean success = authService.register(login, password, name,surname);
                if (success) {
                    System.out.println("✅ Registration successful!");
                } else {
                    System.out.printf("❌ Error: Username %s is already taken!\n", login);
                }

            }

            if (userChoise == 3) {
                System.out.println("Exit");
                run = false;
            }
        } while (run);

    }

    private static void showContactMenu() {
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
    private static void printLoginPage() {
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
    }

    private static void addContact(Scanner scanner, User currentUser, ContactService contactService) {
        //Имя;Фамилия;Возраст;Пол;Email;phone1|phone2

        String name = null;
        do {
            System.out.println("Enter name (required) or 'back' for cancel:");
            String userInput = scanner.nextLine();
            if (userInput.equals("back")) {
                System.out.println("Canceled");
                return;
            }

            if (userInput.isEmpty()) {
                System.out.println("❌ Name required!");
            } else {
                name = userInput;
            }
         } while (name == null);

        System.out.println("Enter surname");
        String surname = scanner.nextLine();
        System.out.println("Enter age");
        int age;
        try {
            age = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            age = 0;
            System.out.println("Age is incorrect");
        }
        System.out.println("Enter gender 1 - MALE, 2 - FEMALE, 0 - Skip (default MALE)");
        String gen = scanner.nextLine();
        Gender gender;
        switch (gen) {
            case "1":
                gender = Gender.MALE;
                break;
            case "2":
                gender = Gender.FEMALE;
                break;
            default:
                gender = Gender.MALE;
        }
        System.out.println("Enter email");
        String email = scanner.nextLine();

        String phone = null;
        List<String> phoneNumbers = new ArrayList<>();
        while (true) {
            System.out.println("Enter phoneNumber (required) or 'back' for cancel:");
            String userInput = scanner.nextLine();

            if (userInput.equals("back")) {
                System.out.println("Canceled");
                return;
            }

            if (userInput.isEmpty() && phoneNumbers.isEmpty()) {
                System.out.println("❌ PhoneNumber required!");
            }

            if (phone == null) {
                return;
            }
            phoneNumbers.add(phone);
        }
        Contact contact = new Contact(name, surname, age, gender, email, phoneNumbers);
        contactService.addContact(contact, currentUser.getLogin());
        System.out.println("✅ Контакт успешно добавлен!");
    }

}