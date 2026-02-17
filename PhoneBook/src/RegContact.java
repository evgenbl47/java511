import java.util.Scanner;

public class RegContact {
    Scanner scanner = new Scanner(System.in);
    Contact contact;

    public Contact register() {
        System.out.println("Enter name");
        String userName = scanner.nextLine();

        System.out.println("Enter surname");
        String userSurname = scanner.nextLine();

        System.out.println("Enter phone number");
        int userPhoneNumber = scanner.nextInt();

        System.out.println("Enter age");
        int userAge = scanner.nextInt();

        return contact = new Contact(userName, userSurname, userPhoneNumber, userAge);

    }

    public Contact reg() {
        String userName = "userName";
        String userSurname = "userSurname";
        long userPhoneNumber = 88005553535L;
        int userAge = 20;

        return contact = new Contact(userName, userSurname, userPhoneNumber, userAge);
    }
}


//Каждый контакт должен содержать:
//Уникальный ID (генерируется автоматически)
//Имя
//Фамилия
//Номер телефона
//Возраст