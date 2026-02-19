package tmp;

import java.util.List;
import java.util.Scanner;

public class Runner {

    public void run() {
        Logger logger = new Logger();
        ContactManager contactManager = new ContactManager();
        FileHandler fileHandler = new FileHandler();
        Scanner scanner = new Scanner(System.in);

        int userChoise;
        while (true) {
            System.out.println("""
                1 - Показать все контакты.
                2 - Добавить новый контакт.
                3 - Сохранить в файл.
                4 - Загрузить из файла.
                5 - Выход.""");

            userChoise = scanner.nextInt();
            scanner.nextLine();

            switch (userChoise) {
                case 1:
                    contactManager.printAllContacts();
                    break;
                case 2:
                    System.out.println("Type name: ");
//                    String name = scanner.nextLine();
                    String name = "name";
                    System.out.println("Type surName: ");
//                    String surName = scanner.nextLine();
                    String surName = "surName";
                    System.out.println("Type e-mail: ");
//                    String email = scanner.nextLine();
                    String email = "email";
                    System.out.println("Type phoneNumber: ");
//                    String phoneNumber = scanner.nextLine();
                    String phoneNumber = "8-800-555-35-35";
                    System.out.println("Type age: ");
//                    int age = scanner.nextInt();
                    int age = 21;
//                    scanner.nextLine();

                    contactManager.addContact(name, surName, age, email, phoneNumber);
                    break;
                case 3:
                    fileHandler.saveToFile(contactManager.getAllContacts());
                    break;
                case 4:
                    List<Contact> loaded = fileHandler.loadFromFile();
                    break;
                case 5:
                    return;
                default:
                    break;
            }


        }
    }

}
